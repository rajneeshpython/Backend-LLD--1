package SolidPrinciples.isp.notificationExample;

public class AdminNotifier implements EmailNotifiable, SMSNotifiable, PushNotifiable {
    @Override
    public void sendEmailNotification(User user) {
        System.out.println("Sending Email notification to " + user.getName());
    }

    @Override
    public void sendPushNotification(User user) {
        System.out.println("Sending push notification to " + user.getName());
    }

    @Override
    public void sendSMSNotification(User user) {
        System.out.println("Sending SMS notification to " + user.getName());
    }
}
