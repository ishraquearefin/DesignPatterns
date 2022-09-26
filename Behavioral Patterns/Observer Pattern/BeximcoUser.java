package com.learning.observerPattern;


//Observer Class
public class BeximcoUser implements Observer{
    private StockMarket stockMarket;

    public BeximcoUser(StockMarket stockMarket){
        this.stockMarket=stockMarket;
    }
    @Override
    public void update(int value) {
        System.out.println("notified Beximco User "+value);
    }

    @Override
    public void updateSpecific() {
        System.out.println("notified Beximco User Pull "+stockMarket.getSharePrice());
    }
}
