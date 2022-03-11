package com.company;

//Request class
public class Stock {
    public String name;
    public int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    //This outputs the command from Broker's CommandPattern
    public void buy() {
        System.out.println("Stock [ Name: " + name + " Quantity: " + quantity + " ] bought");
    }

    //This outputs the command from Broker's CommandPattern
    public void sell() {
        System.out.println("Stock [ Name: " + name + " Quantity: " + quantity + " ] sold");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
