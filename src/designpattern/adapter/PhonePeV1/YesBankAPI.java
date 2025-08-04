package designpattern.adapter.PhonePeV1;

public class YesBankAPI {
    public int balanceCheck(){
        System.out.println("YesBankAPI checking the balance");
        return 100;
    }

    public void transferMoney(){
        System.out.println("Transferring Money via YesBankAPI");
    }
}
