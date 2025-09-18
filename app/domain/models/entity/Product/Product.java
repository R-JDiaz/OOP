package app.domain.models.entity;

import app.domain.models.enums.ProductStatus;

public class Product {
    final String id;
    String name;
    Double cost;
    Double retail;
    String unitOfMeasurement;
    ProductStatus status;

    public Product(String id, 
                   String name, 
                   Double cost, 
                   Double retail, 
                   String unitOfMeasurement, 
                   ProductStatus status) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.retail = retail;
        this.unitOfMeasurement = unitOfMeasurement;
        this.status = status;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Double getCost() { return cost; }
    public Double getRetail() { return retail; }
    public String getUnitOfMeasurement(){ return unitOfMeasurement; }
    public ProductStatus getStatus() { return status; }

    public void setStatus(ProductStatus newStatus)  {
        this.status = newStatus;
    }
}
