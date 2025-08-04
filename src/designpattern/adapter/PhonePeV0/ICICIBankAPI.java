package designpattern.adapter.PhonePeV0;

public class ICICIBankAPI {
    public int getBalance(){
        System.out.println("Getting balance via YesBankAPI  ");
        return 100;
    }

    public void transfer(int amount){
        System.out.println(amount + " : Transferring Money via ICICIBankAPI");
    }
}
