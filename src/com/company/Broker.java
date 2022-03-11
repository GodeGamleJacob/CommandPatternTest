package com.company;
//Command invoker class

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//This class takes and executes commands
class CommandPatternDemo {
    public static void main(String[] args) {
        int choice;
        int quant;
        String[] stockName = {"Novo", "Vestas", "Asus", "Tesla", "S&P500", "C25", "QuantoFuel"};
        int[] price = {6000, 2000, 1000, 500, 5000, 3000, 4000};
        int quantity;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < stockName.length; i++) {
            System.out.format("\n %s %d \n", stockName[i], i);
        }
        System.out.println("\nPlease write, what stock to buy!\n");
        choice = input.nextInt();
        System.out.println("Stock chosen: " + choice + " " + stockName[choice]);
        System.out.println("The price for your chosen stock is: " + price[choice]);
        System.out.println("Now chose the amount of stocks to buy");
        quant = input.nextInt();
        System.out.println("Amount chosen: " + quant);

        Stock myStock = new Stock(stockName[choice],quant);

        BuyStock buyStockOrder = new BuyStock(myStock);
        SellStock sellStockOrder = new SellStock(myStock);

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