package model;

import java.util.ArrayList;
import java.util.List;

public class Dish {
    private String recipe;
    private List<String> ingredients;
    private String description;
    private String name;

    public Dish(String name){
        this.recipe = null;
        this.ingredients = null;
        this.description = null;
        this.name = name;
    }
    public Dish(String name, String description, List<String> ingredients, String recipe){
        this.recipe = recipe;
        this.ingredients = ingredients;
        this.description = description;
        this.name = name;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
