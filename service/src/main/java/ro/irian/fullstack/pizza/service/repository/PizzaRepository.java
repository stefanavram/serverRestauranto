package ro.irian.fullstack.pizza.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.irian.fullstack.pizza.domain.entity.PizzaEntity;


@Repository
public interface PizzaRepository extends JpaRepository<PizzaEntity, String> {

}
