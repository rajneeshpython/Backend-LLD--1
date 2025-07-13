package SolidPrinciples.isp.notificationExample;

public class PushNotifier implements PushNotifiable{

    @Override
    public void sendPushNotification(User user) {
        System.out.println("Sending push notification to " + user.getName());
    }
}
