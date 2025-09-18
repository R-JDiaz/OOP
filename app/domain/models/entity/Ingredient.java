package app.domain.models.entity;

import app.services.interfaces.InventoryItem;
import app.services.interfaces.IIngredient;

public class Ingredient extends Item implements InventoryItem, IIngredient {
    Double unitQuantity;
    Double lowStockThreshold;

    public Ingredient(String id, 
                      String name, 
                      Double cost, 
                      String unitOfMeasurement, 
                      Double unitQuantity,
                      Double lowStockThreshold) {
        super(id, name, cost, unitOfMeasurement);
        this.unitQuantity = unitQuantity;
        this.lowStockThreshold = lowStockThreshold;
    }

    public Double getUnitQty() { return unitQuantity; }
    public Double getLowStockThreshold() { return lowStockThreshold; }

    public void setUnitQty(Double newQty) {
        this.unitQuantity = newQty;
    }

    public boolean isLowStock() {
        return unitQuantity <= lowStockThreshold;
    }

    public boolean isOutOfStock() {
        return unitQuantity <= 0;
    }
}
