package ro.irian.fullstack.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.irian.fullstack.pizza.domain.Review;
import ro.irian.fullstack.pizza.domain.entity.ReviewEntity;
import ro.irian.fullstack.pizza.service.transformers.ReviewTransformer;

/**
 * Created by stefan on 23/11/2016.
 */
@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private PizzaService pizzaService;

    public void addReview(String pizzaId, Review review) {

        ReviewEntity r = ReviewTransformer.transformToEntity(review);
        r.setPizza(pizzaService.findPizza(pizzaId));

        reviewRepository.save(r);
    }
}
