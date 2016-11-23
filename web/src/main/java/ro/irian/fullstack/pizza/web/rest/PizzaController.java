package ro.irian.fullstack.pizza.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.irian.fullstack.pizza.domain.Review;
import ro.irian.fullstack.pizza.domain.entity.PizzaEntity;
import ro.irian.fullstack.pizza.service.PizzaService;
import ro.irian.fullstack.pizza.service.ReviewService;

import java.util.List;

/**
 * REST service for pizzas.
 */


@RestController
@RequestMapping("/rest/pizzas")
public class PizzaController {


    @Autowired
    private ReviewService reviewService;
    @Autowired
    private PizzaService pizzaService;

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
        reviewService.addReview(pizzaId, review);

    }
}
