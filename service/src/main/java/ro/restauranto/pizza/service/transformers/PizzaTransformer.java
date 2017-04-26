package ro.restauranto.pizza.service.transformers;

import ro.restauranto.pizza.domain.Pizza;
import ro.restauranto.pizza.domain.Review;
import ro.restauranto.pizza.domain.entity.PizzaEntity;
import ro.restauranto.pizza.domain.entity.ReviewEntity;

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
