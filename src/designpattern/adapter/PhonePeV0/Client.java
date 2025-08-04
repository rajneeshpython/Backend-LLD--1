package designpattern.adapter.PhonePeV0;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();
        System.out.println("---------------------------------");
        phonePe.rechargeFastTag(50);

        System.out.println("----------------------------------");
        phonePe.availLoan(100);

        System.out.println("----------------------------------");
        phonePe.transfer(100);
    }
}
