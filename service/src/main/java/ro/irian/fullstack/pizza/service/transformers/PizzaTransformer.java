package ro.irian.fullstack.pizza.service.transformers;

import ro.irian.fullstack.pizza.domain.Pizza;
import ro.irian.fullstack.pizza.domain.Review;
import ro.irian.fullstack.pizza.domain.entity.PizzaEntity;
import ro.irian.fullstack.pizza.domain.entity.ReviewEntity;

public class PizzaTransformer {

    public static PizzaEntity transformToEntity(Pizza pizza) {
        PizzaEntity pizzaEntity = new PizzaEntity();
        ReviewEntity reviewEntity;
        pizzaEntity.setId(pizza.get_id());
        pizzaEntity.setName(pizza.getName());
        pizzaEntity.setPrice(pizza.getPrice());
        pizzaEntity.setWeight(pizza.getWeight());
        pizzaEntity.setImage(pizza.getImage());
        pizzaEntity.setIngredients(pizza.getIngredients());
        if (pizza.getReviews() != null) {
            for (Review review : pizza.getReviews()) {
                reviewEntity = new ReviewEntity();
                reviewEntity.setAuthor(review.getAuthor());
                reviewEntity.setBody(review.getBody());
                reviewEntity.setStars(review.getStars());
                pizzaEntity.addReview(reviewEntity);
            }
        }
        return pizzaEntity;
    }
}
