package com.epam.pizza.task;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Order order = new Order();

        pizza.add(Ingredients.Tomato_Paste.getPizzaIngredient(),Ingredients.Tomato_Paste.getPizzaIngredientPrice());
        pizza.add(Ingredients.Cheese.getPizzaIngredient(), Ingredients.Cheese.getPizzaIngredientPrice());
        order.add(pizza);
        System.out.println(pizza.toString());
        System.out.println(order.toString());
        //System.out.println(pizza.getIngredientAndPrice().get("Tomato_Paste"));
        pizza.count();
        System.out.println(order.toString());

    }
}
