package designpattern.adapter.PhonePeV0;

public class PhonePeLoan {
    public boolean checkEligibility(int amount, YesBankAPI yesBankAPI) {
        if(yesBankAPI.balanceCheck() >= amount * .10){
            System.out.println("You are eligible to loan for " +  amount * .10);
            return true;
        }
        else{
            System.out.println("Loan can not be availed");
            return false;
        }
    }
}
