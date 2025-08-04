package designpattern.adapter.PhonePeV1;

public class PhonePe {
    BankAPI bankAPI;
    FastTag fastTag;
    PhonePeLoan phonePeLoan;


    public PhonePe(BankAPI bankAPI){
        this.bankAPI = bankAPI;
        this.fastTag = new FastTag();
        this.phonePeLoan = new PhonePeLoan();
    }

    public void rechargeFastTag(int amount){
        fastTag.recharge(amount, bankAPI);
    }

    public void availLoan(int amount){
        phonePeLoan.checkEligibility(amount, bankAPI);
    }

    public void transfer(int amount){
        if(bankAPI.checkBalance() >= amount){
            System.out.println("Money has bees successfully transferred with amount : " + amount);
        }
        else {
            System.out.println("Sorry you don't have sufficient balance");
        }
    }
}
