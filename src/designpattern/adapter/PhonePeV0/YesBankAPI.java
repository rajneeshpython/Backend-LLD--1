package designpattern.adapter.PhonePeV0;

public class YesBankAPI {
    public int balanceCheck(){
        System.out.println("YesBankAPI checking the balance");
        return 1000;
    }

    public void transferMoney(int amount){
        System.out.println(amount + " : Transferring Money via YesBankAPI");
    }
}
