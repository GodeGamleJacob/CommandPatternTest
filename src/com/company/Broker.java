package com.company;
//Command invoker class

import java.util.ArrayList;
import java.util.List;

//This class takes and executes commands
class CommandPatternDemo {
    public static void main(String[] args) {
        Stock firstStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(firstStock);
        SellStock sellStockOrder = new SellStock(firstStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.takeOrder(buyStockOrder);

        broker.placeOrders();
    }
}

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
