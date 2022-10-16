package FactoryPattern;

public class Email implements Message{
    @Override
    public void send() {
        System.out.println("message from mail");
    }
}
