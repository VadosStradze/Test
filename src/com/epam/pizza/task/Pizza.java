package com.epam.pizza.task;

import java.util.*;

public class Pizza {
    private String name;
    private Double pizzaCost = 0.0;
    private boolean isCalzone;
    private List<Ingredients> ingredientsList;
    private Map<String, Double> ingredientAndPrice;


    public Pizza(Double pizzaCost, boolean pizzaType) {

        this.pizzaCost = pizzaCost;
        this.isCalzone = pizzaType;
        ingredientsList = new ArrayList<>();


    }

    public Pizza() {
        ingredientsList = new ArrayList<>();
        ingredientAndPrice = new HashMap<>();
    }

    public void add(String ingredient, Double ingredientPrice) {
        ingredientAndPrice.put(ingredient, ingredientPrice);
    }

    public Double count() {
        pizzaCost = 1.0;
        if (isCalzone == true){
            pizzaCost= 1.5;

        }
        for (Map.Entry<String, Double> entry : ingredientAndPrice.entrySet()) {
            this.pizzaCost = pizzaCost + entry.getValue();
        }
        return pizzaCost;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaCost=" + pizzaCost +
                ", isCalzone='" + isCalzone + '\'' +
                ", ingredientAndPrise=" + ingredientAndPrice +
                '}';
    }

    public Double getPizzaCost() {
        return pizzaCost;
    }

    public void setPizzaCost(Double pizzaCost) {
        this.pizzaCost = pizzaCost;
    }

    public boolean getCalzone() {
        return isCalzone;
    }

    public void setCalzone(boolean calzone) {
        this.isCalzone = calzone;
    }

    public List<Ingredients> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<Ingredients> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public Map<String, Double> getIngredientAndPrice() {
        return ingredientAndPrice;
    }

    public void setIngredientAndPrice(Map<String, Double> ingredientAndPrice) {
        this.ingredientAndPrice = ingredientAndPrice;
    }

}
