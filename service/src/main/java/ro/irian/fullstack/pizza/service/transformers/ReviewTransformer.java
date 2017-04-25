package ro.irian.fullstack.pizza.service.transformers;

import ro.irian.fullstack.pizza.domain.Review;
import ro.irian.fullstack.pizza.domain.entity.ReviewEntity;

/**
 * Created by seby on 17.11.2016.
 */
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
