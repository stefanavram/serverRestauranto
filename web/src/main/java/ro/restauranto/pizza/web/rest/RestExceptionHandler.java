package ro.restauranto.pizza.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import ro.restauranto.pizza.service.exception.PizzaNotFoundException;
import ro.restauranto.pizza.service.exception.ServiceException;

/**
 * Exception handler for Spring rest controllers annotated with {@see RestController}.
 */
@ControllerAdvice(annotations = RestController.class)
public class RestExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(RestExceptionHandler.class);

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<ExceptionEntity> handleServiceException(ServiceException e) {
        LOG.error("Error during REST call", e);
        if (e instanceof PizzaNotFoundException) {
            return new ResponseEntity<>(ExceptionEntity.from(e), HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(ExceptionEntity.from(e), HttpStatus.BAD_REQUEST);
        }
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionEntity> handleRuntimeException(RuntimeException e) {
        LOG.error("Error during REST call", e);
        return new ResponseEntity<>(ExceptionEntity.from(e), HttpStatus.BAD_REQUEST);
    }

}