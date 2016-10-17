package ro.irian.fullstack.pizza.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ro.irian.fullstack.pizza.service.PizzaServiceConfig;

/**
 * Spring boot main configuration
 *
 * @author Cristi Toth
 */
@Configuration
@EnableAutoConfiguration
@Import({PizzaServiceConfig.class})
@ComponentScan(basePackages = "ro.irian.fullstack.pizza")
public class PizzaSpringApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PizzaSpringApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PizzaSpringApplication.class);
    }
}
