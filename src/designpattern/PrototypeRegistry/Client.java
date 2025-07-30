package designpattern.PrototypeRegistry;

public class Client {
    public static void main(String[] args) {

        ShapeRegistry registry = new ShapeRegistry();

        Circle circle = new Circle(4.5, "red");
        Rectangle rectangle = new Rectangle(10, 20, "green");

        registry.register("red-circle", circle);
        registry.register("green-rectangle", rectangle);

        System.out.println(registry.get("red-circle"));
        System.out.println(registry.get("green-rectangle"));
    }
}
