package app.infrastracture.helpers.validations;

import app.infrastracture.helpers.ErrorHandlers.InvalidQuantityException;
import app.services.interfaces.validators.IQuantityValidator;

public class QuantityValidator implements IQuantityValidator{
    
    @Override
    public boolean validateQuantity(Double amount) {
        if (amount > 0) {
            return true;
        }
        throw new InvalidQuantityException("Input should not be less than 0(zero)");
    }

    @Override
    public boolean validateQuantityWithThreshold(Double amount , Double maxAmount) {
        if (validateQuantity(amount) && amount < maxAmount) {
            return true;
        }
        throw new InvalidQuantityException("Input are greater than the Max Amount");
    }


}
