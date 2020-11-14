package com.epam.pizza.task;

import java.util.ArrayList;
import java.util.List;

public class OrderLogic {
    private List<Order> orderList;
    //private List<Pizza>

    public OrderLogic() {
        this.orderList = new ArrayList<>();
    }

    public void add(Order order) {
        orderList.add(order);
    }
}
