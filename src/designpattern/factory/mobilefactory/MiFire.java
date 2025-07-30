package designpattern.factory.mobilefactory;

public class MiFire extends MiModel{
    @Override
    public void cpuConfiguration() {
        System.out.println("CPU - C4");
    }

    @Override
    public void ramConfiguration() {
        System.out.println("RAM - 8GB");
    }

    @Override
    public void price() {
        System.out.println("Price - 150$");
    }
}
