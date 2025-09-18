package app.services.interfaces.managers;

import java.util.Optional;

import app.services.interfaces.InventoryItem;

public interface IInventoryManager {
    boolean addStock(InventoryItem item);
    boolean removeStock(String itemId);
    boolean addStockQty(String itemId, Double quantity);
    boolean reduceStockQty(String itemId, Double quantity);
    Optional<InventoryItem> findStockById(String id);
}
