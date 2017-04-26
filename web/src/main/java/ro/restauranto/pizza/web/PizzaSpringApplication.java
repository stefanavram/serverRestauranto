package ro.restauranto.pizza.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ro.restauranto.pizza.service.PizzaServiceConfig;

/**
 * Spring boot main configuration
 *
 */
@Configuration
@EnableAutoConfiguration
@Import({PizzaServiceConfig.class})
@ComponentScan(basePackages = "ro.restauranto.pizza")
public class PizzaSpringApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PizzaSpringApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PizzaSpringApplication.class);
    }
}
