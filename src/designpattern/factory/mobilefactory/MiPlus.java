package designpattern.factory.mobilefactory;

public class MiPlus extends MiModel {
    @Override
    public void cpuConfiguration() {
        System.out.println("CPU - C5");
    }

    @Override
    public void ramConfiguration() {
        System.out.println("RAM - 16GB");
    }

    @Override
    public void price() {
        System.out.println("Price - 250$");
    }
}
