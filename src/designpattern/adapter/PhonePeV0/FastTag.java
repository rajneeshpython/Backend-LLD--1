package designpattern.adapter.PhonePeV0;

public class FastTag {
    public void recharge(int amount, YesBankAPI yesBankAPI){
        if(yesBankAPI.balanceCheck() >= amount){
            System.out.println("Your fast tag successfully recharged with amount - " + amount);
        }
        else {
            System.out.println("Your fast tag failed with amount - " + amount);
        }
    }
}
