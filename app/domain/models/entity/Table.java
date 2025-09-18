package app.domain.models.entity;

import app.domain.models.enums.TableStatus;

public class Table {
    final String id;
    int capacity;
    TableStatus status;

    public Table(String id,
                 int capacity,
                 TableStatus status) {
        this.id = id;
        this.capacity = capacity;
        this.status = status;
        }
    
    public String getId() { return id; }
    public int getCapacity() { return capacity; }
    public TableStatus getStatus() { return status; }

    public void setStatus( TableStatus newStatus ) {
        this.status = newStatus;
    }
}
