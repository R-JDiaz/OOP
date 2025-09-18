package app.domain.models.entity;
 
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import app.services.interfaces.InventoryItem;

public class Inventory{
    private final String id;
    private List<InventoryItem> items;
    private HashMap<InventoryItem,Double> lowStockAlerts;

    public Inventory(String id) {
        this.id = id;
        this.items = new ArrayList<>();
        this.lowStockAlerts = new HashMap<>();
    }

    //getters
    public String getId() { return id; }
    public List<InventoryItem> getItems() { return items; }
    public HashMap<InventoryItem,Double> getLowStockAlerts() { return lowStockAlerts; }

    public void setItems(List<InventoryItem> items) {
        this.items = items;
    }

    public void setLowStockAlerts(HashMap<InventoryItem,Double> alerts) {
        this.lowStockAlerts = alerts;
    }



}
