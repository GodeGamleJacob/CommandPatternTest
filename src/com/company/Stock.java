package com.company;

//Request class
public class Stock {
    private String stockName = "Novo Nordisk";
    private int quantity = 10;

    //This outputs the command from Broker's CommandPattern
    public void buy() {
        System.out.println("Stock [ Name: " + stockName + " Quantity: " + quantity + " ] bought");
    }

    //This outputs the command from Broker's CommandPattern
    public void sell() {
        System.out.println("Stock [ Name: " + stockName + " Quantity: " + quantity + " ] sold");
    }

}
