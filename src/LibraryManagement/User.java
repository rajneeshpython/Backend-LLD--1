package LibraryManagement;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;

    User(){
        this.userId = generateUniqueId();
    }

    User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    User(User user){
        this.userId = generateUniqueId();
        this.name = user.getName();
        this.contactInfo = user.getContactInfo();
    }

    public final String generateUniqueId(){
        totalUsers ++;
        return "LibraryManagement.User-";
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }


    abstract void displayDashboard();
    abstract boolean canBorrowBooks();
}
