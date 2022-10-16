package FactoryPattern;

public class NotifactionFactory {
    public static Message notifycreate(String type){
        if(type=="SMS")
            return new Sms();
        else
            return new Email();
    }
}
