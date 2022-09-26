package com.learning.observerPattern;



public class StockMarketUsers {
    public static void main(String[] args) {
       StockMarket marketValue = new StockMarket();
       BeximcoUser bexUser = new BeximcoUser(marketValue);
       SquareUser sqUser = new SquareUser(marketValue);

       marketValue.addObserver(bexUser);
       marketValue.addObserver(sqUser);
       marketValue.setSharePrice(1);

    }
}
