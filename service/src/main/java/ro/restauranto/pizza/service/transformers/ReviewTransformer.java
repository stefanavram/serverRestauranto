package ro.restauranto.pizza.service.transformers;

import ro.restauranto.pizza.domain.Review;
import ro.restauranto.pizza.domain.entity.ReviewEntity;

public class ReviewTransformer {

    public static ReviewEntity transformToEntity(Review review) {
        ReviewEntity reviewEntity = new ReviewEntity();
        reviewEntity.setStars(review.getStars());
        reviewEntity.setAuthor(review.getAuthor());
        reviewEntity.setBody(review.getBody());
        reviewEntity.setCreatedOn(review.getCreatedOn());
        return reviewEntity;
    }
}
