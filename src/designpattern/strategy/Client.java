package designpattern.strategy;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy strategy = new PaymentStrategy();
        Item item = new Item("1001", 100);
        Item item2 = new Item("1002", 200);
        Item item3 = new Item("1003", 300);

        strategy.addItem(item);
        strategy.addItem(item2);
        strategy.addItem(item3);

        System.out.println("Processing payment for Items ... ");
        Payment payment = new Paypal("example.example@gmail.com", "Ha83838&@");
        strategy.pay(payment);

        Payment payment1 = new CreditCard("1234123412341234","05", "2027", "132");
        strategy.pay(payment1);
    }
}
