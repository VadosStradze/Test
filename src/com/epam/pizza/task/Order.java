package com.epam.pizza.task;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Integer orderNumber;
    private Integer clientNumber;
    private List<Pizza> listOfPizzas;

    public Order(Integer orderNumber, Integer clientNumber) {
        this.clientNumber = clientNumber;
        this.orderNumber = orderNumber;
        listOfPizzas = new ArrayList<>();

    }
    public Order(){
        listOfPizzas = new ArrayList<>();
    }
    public void add(Pizza pizza){
        listOfPizzas.add(pizza);

    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", clientNumber=" + clientNumber +
                ", listOfPizzas=" + listOfPizzas +
                '}';
    }
}
