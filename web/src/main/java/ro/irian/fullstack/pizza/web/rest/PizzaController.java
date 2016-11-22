package ro.irian.fullstack.pizza.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.irian.fullstack.pizza.domain.Review;
import ro.irian.fullstack.pizza.domain.entity.PizzaEntity;
import ro.irian.fullstack.pizza.domain.entity.ReviewEntity;
import ro.irian.fullstack.pizza.service.PizzaService;
import ro.irian.fullstack.pizza.service.ReviewRepository;
import ro.irian.fullstack.pizza.service.transformers.ReviewTransformer;

import java.util.List;

/**
 * REST service for pizzas.
 */


@RestController
@RequestMapping("/rest/pizzas")
public class PizzaController {


    @Autowired
    private PizzaService pizzaService;
    @Autowired
    private ReviewRepository reviewRepository;

    @RequestMapping(method = {RequestMethod.GET})
    public List<PizzaEntity> getAllPizzas() {
        return pizzaService.getAllPizzas();
    }

    @RequestMapping(value = "/{id}", method = {RequestMethod.GET})
    public PizzaEntity findPizza(@PathVariable("id") String pizzaId) {
        return pizzaService.findPizza(pizzaId);
    }

    @RequestMapping(value = "/addReview/{id}", method = {RequestMethod.POST})
    public void addReview(@PathVariable("id") String pizzaId, @RequestBody Review review) {

        ReviewEntity r = ReviewTransformer.transformToEntity(review);
        r.setPizza(pizzaService.findPizza(pizzaId));

        reviewRepository.save(r);
    }
}
