package app.infrastracture.helpers.ErrorHandlers;

public class InvalidQuantityException extends RuntimeException{
    public InvalidQuantityException(String message) {
        super(message);
    }
}
