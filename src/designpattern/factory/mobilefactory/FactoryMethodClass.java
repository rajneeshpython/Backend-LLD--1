package designpattern.factory.mobilefactory;

public class FactoryMethodClass {
    public static MiModel getInstance(ModelType model) {
        MiModel mobile = null;
        if (model == ModelType.MiBolt) {
            mobile = new MiBolt();
        }
        else if (model == ModelType.MiFire) {
            mobile = new MiFire();
        }
        return mobile;
    }
}
