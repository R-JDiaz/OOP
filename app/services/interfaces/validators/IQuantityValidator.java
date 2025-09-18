package app.services.interfaces.validators;

public interface IQuantityValidator {
    boolean validateQuantity(Double amount);
    boolean validateQuantityWithThreshold(Double amount, Double maxAmount);
}
