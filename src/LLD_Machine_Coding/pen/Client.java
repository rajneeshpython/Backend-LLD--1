package LLD_Machine_Coding.pen;

public class Client {
    public static void main(String[] args) {
        // Create BallPen
        Pen ballPen = new BallPen(
                "Reynolds",
                new Ink("Blue", 2.0, 0.7),
                new Nib(1, "Brass"),
                Mechanism.CLICK,
                false
        );

        // Create GelPen
        Pen gelPen = new GelPen(
                "Pilot",
                new Ink("Black", 1.5, 0.5),
                new Nib(2, "Steel"),
                Mechanism.CAP,
                true
        );

        // Create FountainPen
        Pen fountainPen = new FountainPen(
                "Parker",
                new Ink("Blue", 5.0, 0.3),
                new Nib(3, "Gold"),
                Mechanism.CAP,
                true
        );

        // Demonstrate writing
        ballPen.write("Writing with ball pen");
        gelPen.write("Writing with gel pen");
        fountainPen.write("Writing with fountain pen");

        // Demonstrate refilling
        ballPen.refill(new Ink("Blue", 2.0, 0.7));
        gelPen.refill(new Ink("Black", 1.5, 0.5));
        fountainPen.refill(new Ink("Blue", 5.0, 0.3));
    }
}
