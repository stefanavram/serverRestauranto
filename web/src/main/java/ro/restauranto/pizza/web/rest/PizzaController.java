package ro.restauranto.pizza.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.restauranto.pizza.domain.Reservation;
import ro.restauranto.pizza.domain.Review;
import ro.restauranto.pizza.domain.entity.PizzaEntity;
import ro.restauranto.pizza.service.PizzaService;
import ro.restauranto.pizza.service.ReservationService;
import ro.restauranto.pizza.service.ReviewService;
import ro.restauranto.pizza.service.exception.OKResponse;

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
    public OKResponse addReservation(@RequestBody Reservation reservation) {
        reservationService.addReservation(reservation);
        return new OKResponse(true);
    }
}
