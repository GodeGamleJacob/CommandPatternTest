package com.company;

//Concrete classes, implementing the interface in Order
public class SellStock implements Order {
    private Stock myStock;

    public SellStock(Stock myStock) {
        this.myStock = myStock;
    }

    public void execute() {
        myStock.sell();
    }
}
