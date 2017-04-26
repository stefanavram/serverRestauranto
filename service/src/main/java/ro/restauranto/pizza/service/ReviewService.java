package ro.restauranto.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.restauranto.pizza.domain.Review;
import ro.restauranto.pizza.domain.entity.ReviewEntity;
import ro.restauranto.pizza.service.repository.ReviewRepository;
import ro.restauranto.pizza.service.transformers.ReviewTransformer;

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
