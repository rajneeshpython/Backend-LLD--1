package designpattern.adapter.PhonePeV0;

public class PhonePe {
    YesBankAPI yesBankAPI;
    FastTag fastTag;
    PhonePeLoan phonePeLoan;


    public PhonePe(){
        this.yesBankAPI = new YesBankAPI();
        this.fastTag = new FastTag();
        this.phonePeLoan = new PhonePeLoan();
    }

    public void rechargeFastTag(int amount){
        fastTag.recharge(amount, yesBankAPI);
    }

    public void availLoan(int amount){
        phonePeLoan.checkEligibility(amount, yesBankAPI);
    }

    public void transfer(int amount){
        if(yesBankAPI.balanceCheck() >= amount){
            System.out.println("Money has bees successfully transferred with amount : " + amount);
        }
        else {
            System.out.println("Sorry you don't have sufficient balance");
        }
    }
}
