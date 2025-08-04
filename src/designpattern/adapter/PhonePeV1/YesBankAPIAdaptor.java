package designpattern.adapter.PhonePeV1;

public class YesBankAPIAdaptor implements BankAPI{
    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public int checkBalance() {
        return  yesBankAPI.balanceCheck();
    }

    @Override
    public void transferMoney() {
        yesBankAPI.transferMoney();
    }
}
