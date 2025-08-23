package LLD_Machine_Coding.pen;

public abstract class Pen {
    private String brand;
    private Ink ink;
    private Nib nib;
    private Mechanism mechanism;
    private boolean refillable;

    Pen(String brand, Ink ink, Nib nib, Mechanism mechanism, boolean refillable) {
        this.brand = brand;
        this.ink = ink;
        this.nib = nib;
        this.mechanism = mechanism;
        this.refillable = refillable;
    }

    public String getBrand() {
        return brand;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Nib getNib() {
        return nib;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }

    public void setMechanism(Mechanism mechanism) {
        this.mechanism = mechanism;
    }

    public Mechanism getMechanism() {
        return mechanism;
    }

    public boolean isRefillable() {
        return refillable;
    }

    public  abstract void write(String text);
    public  abstract void refill(Ink ink);
}
