package LLD_Machine_Coding.pen;

public class Ink {
    private String color;
    private double capacity;  // in ml
    private double viscosity; // in scale: 0.0 - 1.0

    public Ink(String color, double capacity, double viscosity) {
        this.color = color;
        this.capacity = capacity;
        this.viscosity = viscosity;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getColor() {
        return color;
    }

    public double getViscosity() {
        return viscosity;
    }

    public void consume(double capacity) {
        if (capacity > this.capacity) {
            throw new IllegalArgumentException("Not enough Ink");
        }
        this.capacity -= capacity;
    }

    public void refill(double capacity) {
        this.capacity += capacity;
    }


    @Override
    public String toString() {
        return "Ink{" +
                "color='" + color + '\'' +
                ", capacity=" + capacity +
                ", viscosity=" + viscosity +
                '}';
    }
}
