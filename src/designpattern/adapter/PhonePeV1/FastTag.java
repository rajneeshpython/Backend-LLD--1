package designpattern.adapter.PhonePeV1;

public class FastTag {
    public void recharge(int amount, BankAPI bankAPI){
        if(bankAPI.checkBalance() >= amount){
            System.out.println("Your fast tag successfully recharged with amount - " + amount);
        }
        else {
            System.out.println("Your fast tag failed with amount - " + amount);
        }
    }
}
