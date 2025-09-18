package app.domain.models.entity;

import app.services.interfaces.IIngredient;
import java.util.HashMap;
import java.util.Map;

public class Recipe {
    String id;
    String name;
    Map<IIngredient, Integer> ingredients;

    public Recipe(String id, String name) {
        this.id = id;
        this.name = name;
        this.ingredients = new HashMap<>();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Map<IIngredient, Integer> getIngredient() { return ingredients; }

    public boolean addIngredient(IIngredient ingredient, Integer quantity) {
        if (ingredients.containsKey(ingredient) && 
            ingredient != null && 
            quantity != null) {
            ingredients.put(ingredient, quantity);
            return true;
        }
        return false;
    }

}
