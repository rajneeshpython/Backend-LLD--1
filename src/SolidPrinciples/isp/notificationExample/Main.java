package SolidPrinciples.isp.notificationExample;

public class Main {
    public static void main(String[] args) {
        User user = new User("Rajneesh", "xxxx", UserType.EMAIL);
        User user1 = new User("Kamlesh", "yyyy", UserType.PUSH);
        User user2 = new User("Abhishek", "zzzz", UserType.SMS);
        User user3 = new User("Pravesh", "dddd", UserType.ADMIN);

        EmailNotifier emailNotifier = new EmailNotifier();
        PushNotifier pushNotifier = new PushNotifier();
        SMSNotifier smsNotifier = new SMSNotifier();
        AdminNotifier adminNotifier = new AdminNotifier();

        System.out.println(user.getName() + " is subscribed to email notification");
        emailNotifier.sendEmailNotification(user);

        System.out.println(user1.getName() + " is subscribed to push notification");
        pushNotifier.sendPushNotification(user1);

        System.out.println(user2.getName() + " is subscribed to sms notification");
        smsNotifier.sendSMSNotification(user2);

        System.out.println(user3.getName() + " is subscribed to admin(All) notification");
        adminNotifier.sendEmailNotification(user3);
        adminNotifier.sendSMSNotification(user3);
        adminNotifier.sendPushNotification(user3);
    }
}
