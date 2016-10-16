package ro.irian.fullstack.pizza.service.exception;

/**
 * @author Cristi Toth
 */
public class PizzaNotFoundException extends ServiceException {

    private String id;

    public PizzaNotFoundException(String id) {
        super();
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
