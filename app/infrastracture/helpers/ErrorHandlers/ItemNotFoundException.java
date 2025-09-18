package app.infrastracture.helpers.ErrorHandlers;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(String itemId) {
        super("The Id : " + itemId + " , were not found!");
    }
}
