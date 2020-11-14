package com.epam.pizza.task;

public enum Ingredients {

    Tomato_Paste("Tomato_Paste", 1.0),
    Cheese("Cheese", 1.0),
    Salami("Salami", 1.5),
    Bacon("Bacon", 1.2),
    Garlic("Garlic", 0.3),
    Corn("Corn", 0.7),
    Pepperoni("Pepperoni", 0.6),
    Olives("Olives", 0.5);

    private String pizzaIngredient;
    private Double pizzaIngredientPrice;

    Ingredients(String pizzaIngredient, Double pizzaIngredientPrice) {
        this.pizzaIngredient = pizzaIngredient;
        this.pizzaIngredientPrice = pizzaIngredientPrice;

    }

    public String getPizzaIngredient() {
        return pizzaIngredient;
    }

    public void setPizzaIngredient(String pizzaIngredient) {
        this.pizzaIngredient = pizzaIngredient;
    }

    public Double getPizzaIngredientPrice() {
        return pizzaIngredientPrice;
    }

    public void setPizzaIngredientPrice(Double pizzaIngredientPrice) {
        this.pizzaIngredientPrice = pizzaIngredientPrice;
    }
}
