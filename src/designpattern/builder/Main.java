package designpattern.builder;

public class Main {
    public static void main(String[] args) {

        User user = new User.Builder("Rajneesh", "Kumar")
                .age(30)
                .email("rajneesh.kumar@gmail.com")
                .phoneNumber("837377373")
                .build();
        System.out.println(user.getFirstName() + ", " + user.getLastName() + ", " + user.getAge() + ", " + user.getEmail() + ", " + user.getPhoneNumber());

        User user1 = new User.Builder("Pankaj", "Kumar")
                .build();
        System.out.println(user1.getFirstName() + ", " + user1.getLastName() + ", " + user1.getAge() +  ", " + user1.getEmail() + ", " + user1.getPhoneNumber());

        User user2 = new User.Builder("Ramesh", "Kumar")
                .age(25)
                .build();
        System.out.println(user2.getFirstName() + ", " + user2.getLastName() + ", " + user2.getAge() +  ", " + user2.getEmail() + ", " + user2.getPhoneNumber());
    }
}
