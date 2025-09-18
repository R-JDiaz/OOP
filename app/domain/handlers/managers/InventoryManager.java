package app.domain.handlers.managers;

import app.services.interfaces.InventoryItem;
import app.services.interfaces.validators.IQuantityValidator;
import app.services.interfaces.managers.IInventoryManager;


import java.util.Optional;

import app.domain.models.entity.Inventory;
import app.infrastracture.helpers.ErrorHandlers.ItemNotFoundException;

public class InventoryManager implements IInventoryManager{
    private final Inventory inventory;
    private final IQuantityValidator validator;

    public InventoryManager(Inventory inventory, IQuantityValidator validator) {
        this.inventory = inventory;
        this.validator = validator;
    }

    @Override
    public Optional<InventoryItem> findStockById(String id) {
        return inventory.getItems()
               .stream()
               .filter(item -> item.getId().equals(id))
               .findFirst();
    }

    @Override
    public boolean addStock(InventoryItem item) {
        if(item != null) {
            return inventory.getItems().add(item);
        }
        throw new IllegalArgumentException("Item should not be null");
    }

    @Override
    public boolean removeStock(String itemId) {
        return findStockById(itemId)
               .map(i -> {
                inventory.getItems().remove(i);
                return true;
               }).orElseThrow(() -> new ItemNotFoundException("Item Id: " + itemId + " ,not Found in Inventory"));
    }

    @Override
    public boolean addStockQty(String itemId, Double quantity) {
        return findStockById(itemId)
               .map(i -> {
                validator.validateQuantity(quantity);
                i.setUnitQty(i.getUnitQty() + quantity);
                return true;
               }).orElseThrow(() -> new ItemNotFoundException("Item Id: " + itemId + " ,not Found in Inventory"));
    }

    @Override
    public boolean reduceStockQty(String itemId, Double quantity) {
        return findStockById(itemId)
               .map(i -> {
                validator.validateQuantityWithThreshold(quantity, i.getUnitQty());
                i.setUnitQty(i.getUnitQty() - quantity);
                return true;
               }).orElseThrow(() -> new ItemNotFoundException("Item Id: " + itemId + " ,not Found in Inventory"));
    }
}
