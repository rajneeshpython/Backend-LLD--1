package designpattern.strategy;

public class CreditCard implements Payment {
    private String cardNumber;
    private String expiryMonth;
    private String expiryYear;
    private String cvv;

    public CreditCard(String cardNumber, String expiryMonth, String expiryYear, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cvv = cvv;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using CreditCard");
    }
}
