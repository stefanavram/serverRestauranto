package ro.irian.fullstack.pizza.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.irian.fullstack.pizza.domain.Reservation;
import ro.irian.fullstack.pizza.domain.Review;
import ro.irian.fullstack.pizza.domain.entity.PizzaEntity;
import ro.irian.fullstack.pizza.domain.entity.ReservationEntity;
import ro.irian.fullstack.pizza.service.PizzaService;
import ro.irian.fullstack.pizza.service.ReservationService;
import ro.irian.fullstack.pizza.service.ReviewService;
import ro.irian.fullstack.pizza.service.repository.ReservationRepository;

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

    @Autowired
    private ReservationService reservationService;

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

    @RequestMapping(value = "/addReservation", method = {RequestMethod.POST})
    public Boolean addReservation(@RequestBody Reservation reservation) {
        reservationService.addReservation(reservation);
        return true;
    }
}
