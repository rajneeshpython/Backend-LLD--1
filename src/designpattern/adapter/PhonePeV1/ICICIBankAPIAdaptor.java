package designpattern.adapter.PhonePeV1;

public class ICICIBankAPIAdaptor implements BankAPI {
    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public int checkBalance() {
        return iciciBankAPI.getBalance();
    }
    @Override
    public void transferMoney() {
        iciciBankAPI.transfer();
    }
}
