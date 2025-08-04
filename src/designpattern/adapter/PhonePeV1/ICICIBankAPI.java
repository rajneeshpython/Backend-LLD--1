package designpattern.adapter.PhonePeV1;

public class ICICIBankAPI {
    public int getBalance(){
        System.out.println("Getting balance via ICICIBankAPI");
        return 100;
    }

    public void transfer(){
        System.out.println("Transferring Money via ICICIBankAPI");
    }
}
