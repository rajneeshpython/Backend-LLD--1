package designpattern.factory.mobilefactory;

public class MiBolt extends MiModel{

    @Override
    public void cpuConfiguration() {
        System.out.println("CPU - C3");
    }

    @Override
    public void ramConfiguration() {
        System.out.println("Ram - 4GB");
    }

    @Override
    public void price() {
        System.out.println("Price - 100$");
    }
}

