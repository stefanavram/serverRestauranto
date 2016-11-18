package ro.irian.fullstack.pizza.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ro.irian.fullstack.pizza.domain.Review;
import ro.irian.fullstack.pizza.domain.entity.PizzaEntity;
import ro.irian.fullstack.pizza.domain.entity.ReviewEntity;

import java.util.List;

/**
 * Created by seby on 16.11.2016.
 */

@Repository
public interface ReviewRepository extends JpaRepository<ReviewEntity, String> {

    @Query("select r from #{#entityName} r where r.pizza = ?1")
    List<ReviewEntity> findAllReviewsByPizzaId(String pizzaId);
}
