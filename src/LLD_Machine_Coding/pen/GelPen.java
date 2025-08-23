package LLD_Machine_Coding.pen;

public class GelPen extends Pen {
    public GelPen(String brand, Ink ink, Nib nib, Mechanism mech, boolean refillable) {
        super(brand, ink, nib, mech, refillable);
    }

    @Override
    public void write(String text) {
        Ink ink = getInk();
        if (ink == null) {
            System.out.println("No Ink category present!");
            return;
        }
        System.out.println(getBrand() + " FountainPen writing: " + text);
        ink.consume(1.0);
    }

    @Override
    public void refill(Ink ink) {
        if(isRefillable()){
            setInk(ink);
            System.out.println(getBrand() + " FountainPen is refilled with color: " + ink.getColor() + " ink");
        }
        else {
            System.out.println(getBrand() + " GelPen isn't refillable");
        }
    }
}
