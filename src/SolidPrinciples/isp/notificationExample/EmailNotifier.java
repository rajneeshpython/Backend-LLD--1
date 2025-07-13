package SolidPrinciples.isp.notificationExample;

public class EmailNotifier implements EmailNotifiable {

    @Override
    public void sendEmailNotification(User user) {
        System.out.println("Sending Email notification to " + user.getName());
    }
}
