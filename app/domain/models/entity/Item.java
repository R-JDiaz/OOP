package app.domain.models.entity;

public class Item {
    final String id;
    String name;
    Double cost;
    String unitOfMeasurement;

    public Item(String id, String name, Double cost, String unitOfMeasurement) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Double getCost() { return cost; }
    public String getUnitOfMeasurement(){ return unitOfMeasurement; }
    
}
