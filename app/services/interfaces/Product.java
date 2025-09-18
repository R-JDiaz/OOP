package app.services.interfaces;
import app.domain.models.enums.ProductStatus;

public interface Product extends Item {
    //for sale
    Double getRetail();
    ProductStatus getStatus();
}
