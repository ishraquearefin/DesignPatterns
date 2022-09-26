package com.learning.observerPattern;

import java.util.ArrayList;
import java.util.List;

//This Class will work as the maintainer of observers
public class Subject {
    List<Observer> observerList = new ArrayList<>();
    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }
    public void notifyObserver(int value){
      for(Observer observer:observerList){
          observer.update(value);
          observer.updateSpecific();
      }
    }
}
