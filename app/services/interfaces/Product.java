package app.services.interfaces;
import app.domain.models.enums.ProductStatus;

public interface Product {
    //for sale
    String getId();
    String getName();
    Double getCost();
    Double getRetail();
    Double getUnitQty();
    ProductStatus getStatus();
}
