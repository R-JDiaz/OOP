package app.services.interfaces;

public interface InventoryItem extends Item {
    boolean isLowStock();
    boolean isOutOfStock();
    String getUnitOfMeasurement();
    void setUnitQty(Double newQty);
}
