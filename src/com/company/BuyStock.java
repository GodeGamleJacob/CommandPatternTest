package com.company;

//Concrete classes, implementing the interface in Order
public class BuyStock implements Order {
    private Stock firstStock;

    public BuyStock(Stock firstStock) {
        this.firstStock = firstStock;
    }

    public void execute() {
        firstStock.buy();
    }
}
