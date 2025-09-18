package app.services.interfaces;

interface MenuProduct extends Product {
    String getId();
    String getName();
    Double getCost();
    Double getRetail();
    Double getUnitQty();
    Double getStatus();
}
