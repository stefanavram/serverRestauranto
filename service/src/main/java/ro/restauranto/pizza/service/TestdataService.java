package ro.restauranto.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.restauranto.pizza.domain.Pizza;
import ro.restauranto.pizza.domain.Review;
import ro.restauranto.pizza.service.repository.PizzaRepository;
import ro.restauranto.pizza.service.transformers.PizzaTransformer;


@Service
public class TestdataService {

    @Autowired
    private PizzaRepository pizzaRepository;


    @Transactional
    public void createTestdata() {
        Pizza pizza;

        pizza = new Pizza("pizza1",
                          "4 STAGIONI",
                          27.5,
                          550,
                          "images/quattro.png",
                          "sos rosii, mozzarella, ciuperci, salam, sunca presata, oregano, anghinare");
        pizza.addReview(new Review(5, "I love this pizza!", "joe@example.org", 100000000L));
        pizza.addReview(new Review(4, "It's great!", "miha@example.org", 100000000L));
//        pizzas.add(pizza);
        pizzaRepository.save(PizzaTransformer.transformToEntity(pizza));

        pizza = new Pizza("pizza2",
                          "PEPPERONI",
                          25D,
                          450,
                          "images/pepperoni.png",
                          "sos rosii, mozzarella, salam picant, oregano");
        pizza.addReview(new Review(5, "It's the best pizza!", "marius@restauranto.ro", 110000000L));
        pizza.addReview(new Review(1, "It's awful!", "cristi@restauranto.ro", 130000000L));
//        pizzas.add(pizza);
        pizzaRepository.save(PizzaTransformer.transformToEntity(pizza));


        pizza = new Pizza("pizza3",
                          "MARGARITA",
                          21.5,
                          500,
                          "images/margarita.png",
                          "sos rosii, mozzarella, oregano");
        pizza.addReview(new Review(2, "It's too boring!", "cristi@restauranto.ro", 140000000L));
//        pizzas.add(pizza);
        pizzaRepository.save(PizzaTransformer.transformToEntity(pizza));

    }


}
