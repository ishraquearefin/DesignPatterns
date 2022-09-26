package com.learning.observerPattern;

//
public interface Observer {
    //Used for push system
    public void update(int value);
    //Used for pull System
    public void updateSpecific();
}
