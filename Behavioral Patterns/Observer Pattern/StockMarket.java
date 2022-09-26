package com.learning.observerPattern;

//This class works as publisher
public class StockMarket extends Subject {
    private int sharePrice;

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
        notifyObserver(sharePrice);

    }
}
