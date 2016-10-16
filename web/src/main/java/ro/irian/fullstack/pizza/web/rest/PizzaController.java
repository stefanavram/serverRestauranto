package ro.irian.fullstack.pizza.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.irian.fullstack.pizza.domain.entity.PizzaEntity;
import ro.irian.fullstack.pizza.service.PizzaService;

import java.util.List;

/**
 * REST service for pizzas.
 *
 *
 */
@RestController
@RequestMapping("/rest/pizzas")
public class PizzaController {


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
}
