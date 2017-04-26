package ro.restauranto.pizza.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ro.restauranto.pizza.domain.entity.ReviewEntity;

import java.util.List;



@Repository
public interface ReviewRepository extends JpaRepository<ReviewEntity, String> {

    @Query("select r from #{#entityName} r where r.pizza = ?1")
    List<ReviewEntity> findAllReviewsByPizzaId(String pizzaId);
}
