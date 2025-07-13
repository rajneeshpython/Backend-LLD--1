package SolidPrinciples.isp.notificationExample;

public class User {
    private String name;
    private String contact;
    private UserType userType;

    public User(String name, String contact, UserType userType) {
        this.name = name;
        this.contact = contact;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public UserType getUserType() {
        return userType;
    }
}
