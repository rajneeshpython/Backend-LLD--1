package designpattern.decorator;

public class SugarDecorator extends  CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.0;
    }
}
