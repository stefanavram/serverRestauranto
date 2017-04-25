package ro.irian.fullstack.pizza.service;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Spring configuration for service module.
 *
 * @author Cristi Toth
 */
@Configuration
@EntityScan(basePackages = "ro.irian")
@ComponentScan(basePackages = "ro.irian")
@EnableJpaRepositories(basePackages = "ro.irian.fullstack.pizza")
public class PizzaServiceConfig {

}
