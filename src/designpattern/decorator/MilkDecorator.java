package designpattern.decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription() + ", Milk";
    }

    @Override
    public double getPrice() {
        return coffeeDecorator.getPrice() + 1.0;
    }
}
