package FactoryPattern;

public class Sms implements Message{
    @Override
    public void send() {
        System.out.println("message from sms");
    }
}
