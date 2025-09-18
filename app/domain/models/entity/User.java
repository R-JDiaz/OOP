package app.domain.models.entity;

import app.domain.models.enums.Roles;

public class User {
    private final String id;
    private String name;
    private String passwordHash;
    private Roles role;

    User (String id, String name, String passwordHash, Roles role) {
        this.id = id;
        this.name = name;
        this.passwordHash = passwordHash;
        this.role = role;
    }

    //getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getPasswordHash() { return passwordHash; }
    public Roles role() { return role; }

    

}