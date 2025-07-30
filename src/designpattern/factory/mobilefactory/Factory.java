package designpattern.factory.mobilefactory;

public class Factory {
    public MiModel produceMobile(ModelType model) {
        MiModel mobile = null;
        mobile = FactoryMethodClass.getInstance(model);
        return  mobile;
    }
}
