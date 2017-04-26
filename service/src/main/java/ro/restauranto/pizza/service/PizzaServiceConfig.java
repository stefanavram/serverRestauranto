package ro.restauranto.pizza.service;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Spring configuration for service module.
 *
 */
@Configuration
@EntityScan(basePackages = "ro.restauranto")
@ComponentScan(basePackages = "ro.restauranto")
@EnableJpaRepositories(basePackages = "ro.restauranto.pizza")
public class PizzaServiceConfig {

}
