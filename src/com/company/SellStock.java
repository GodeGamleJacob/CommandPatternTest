package com.company;

//Concrete classes, implementing the interface in Order
public class SellStock implements Order {
    private Stock firstStock;

    public SellStock(Stock firstStock) {
        this.firstStock = firstStock;
    }

    public void execute() {
        firstStock.sell();
    }
}
