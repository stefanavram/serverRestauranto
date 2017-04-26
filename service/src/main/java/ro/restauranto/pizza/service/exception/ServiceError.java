package ro.restauranto.pizza.service.exception;

/**
 * Service errors.
 */
public enum ServiceError {
    CUSTOMER_DOES_NOT_EXIST("MG0001"),
    PROVIDER_DOES_NOT_EXIST("MG0002")
    ;

    private final String errorCode;

    ServiceError(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
