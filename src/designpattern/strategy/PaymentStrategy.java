package designpattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class PaymentStrategy {
    private List<Item> items;

    public PaymentStrategy() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

   public int calculateTotal() {
        int totalAmount = 0;
        for (Item item : items) {
            totalAmount += item.getPrice();
        }

        return totalAmount;
   }

   public void  pay(Payment payment) {
        int totalAmount = calculateTotal();
        payment.pay(totalAmount);
   }
}
