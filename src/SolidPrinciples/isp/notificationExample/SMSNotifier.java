package SolidPrinciples.isp.notificationExample;

public class SMSNotifier implements SMSNotifiable{

    @Override
    public void sendSMSNotification(User user){
        System.out.println("Sending SMS notification to " + user.getName());
    }
}
