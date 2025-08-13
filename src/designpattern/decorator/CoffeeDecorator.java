package designpattern.decorator;

public abstract class CoffeeDecorator implements Coffee {
    protected  Coffee coffeeDecorator;
    public CoffeeDecorator(Coffee coffee) {
        this.coffeeDecorator = coffee;
    }

    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription();
    }

    @Override
    public double getPrice() {
        return coffeeDecorator.getPrice();
    }
}
