package com.company;

//Concrete classes, implementing the interface in Order
public class BuyStock implements Order {
    private Stock myStock;

    public BuyStock(Stock myStock) {
        this.myStock = myStock;
    }

    public void execute() {
        myStock.buy();
    }
}
