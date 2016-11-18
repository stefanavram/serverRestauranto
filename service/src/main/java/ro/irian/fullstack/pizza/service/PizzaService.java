package ro.irian.fullstack.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import ro.irian.fullstack.pizza.domain.entity.PizzaEntity;
import ro.irian.fullstack.pizza.domain.entity.ReviewEntity;
import ro.irian.fullstack.pizza.service.exception.PizzaNotFoundException;

import java.util.List;

/**
 * Service for customers.
 *
 * @author Michael Kurz
 */

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;
    @Autowired
    private ReviewRepository reviewRepository;

    public List<PizzaEntity> getAllPizzas() {

        return pizzaRepository.findAll();
    }

    public PizzaEntity findPizza(String pizzaId) {
        PizzaEntity pizza = pizzaRepository.findOne(pizzaId);
        if (pizza != null) {
            return pizza;
        } else {
            throw new PizzaNotFoundException("Pizza with id: " + pizzaId + " not found!");
        }
    }


//    public List<ReviewEntity> getAllReviews(String pizzaId) {
//        return reviewRepository.findAllReviewsByPizzaId(pizzaId);
//    }
}
