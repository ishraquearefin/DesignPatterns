package com.learning.observerPattern;
//Observer Class
public class SquareUser implements Observer{
    private StockMarket stockMarket;

    public SquareUser(StockMarket stockMarket){
        this.stockMarket=stockMarket;
    }
    @Override
    public void update(int value) {
        System.out.println("notified Square User "+value);
    }

    @Override
    public void updateSpecific() {
        System.out.println("notified Square User Pull "+stockMarket.getSharePrice());
    }
}
