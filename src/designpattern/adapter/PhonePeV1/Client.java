package designpattern.adapter.PhonePeV1;

import java.util.Scanner;

public class Client {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please tell us which bank API you want to use.");
        System.out.println("Available Bank are - Bank API & ICICI Bank : ");
        String bankAPIName = input.nextLine();

        System.out.println("PhonePe using " + bankAPIName + " adaptor API");
        BankAPI bankAPI = null;
        if (bankAPIName.equalsIgnoreCase("Yes Bank")) {
            bankAPI = new YesBankAPIAdaptor();
        } else if (bankAPIName.equalsIgnoreCase("ICICI Bank")) {
            bankAPI = new ICICIBankAPIAdaptor();
        }
        PhonePe phonePe = new PhonePe(bankAPI);

        phonePe.rechargeFastTag(150);
        phonePe.availLoan(100);
        phonePe.transfer(100);
    }
}
