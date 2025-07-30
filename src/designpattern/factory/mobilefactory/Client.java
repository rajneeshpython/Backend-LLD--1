package designpattern.factory.mobilefactory;

public class Client {
    public static void main(String[] args) {

        Factory factory = new Factory();
        System.out.println("Creating MiFire");
        MiModel mobile = factory.produceMobile(ModelType.MiFire);
        mobile.cpuConfiguration();
        mobile.ramConfiguration();
        mobile.price();

        System.out.println("Creating MiBolt");
        MiModel mobile2 = factory.produceMobile(ModelType.MiBolt);
        mobile2.cpuConfiguration();
        mobile2.ramConfiguration();
        mobile2.price();
    }
}
