package FactoryPattern;

public class NotificationService {

public static void main(String[] args) {
    //To send message via Email or SMS;
    Message notify = NotifactionFactory.notifycreate("SMS");
    notify.send();
}




}
