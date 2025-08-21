package designpattern.strategy;

public class Paypal implements Payment {
    private String username;
    private String password;

    public Paypal(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal");
    }
}
