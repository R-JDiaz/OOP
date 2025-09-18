package app.domain.models.entity;

import app.services.interfaces.InventoryProduct;
import app.domain.models.enums.ProductStatus;

public class SimpleProduct extends Product implements InventoryProduct{
    Double lowStockThreshold;
    Double unitQuantity;

    public SimpleProduct(String id, 
                        String name,
                        Double cost, 
                        Double retail, 
                        String unitOfMeasurement, 
                        ProductStatus status,
                        Double unitQuantity, 
                        Double lowStockThreshold) {
        super(id, name, cost, retail, unitOfMeasurement, status);
        this.lowStockThreshold = lowStockThreshold;
        this.unitQuantity = unitQuantity;
    }

    public Double getUnitQty() { return unitQuantity; }
    public Double getlowStockThreshold() { return lowStockThreshold; }

    public void setUnitQty(Double Quantity) {
        this.unitQuantity = Quantity;
    }

    public boolean isOutOfStock() {
        return unitQuantity <= 0;
    }

    public boolean isLowStock() {
        return unitQuantity <= lowStockThreshold;
    }

}
