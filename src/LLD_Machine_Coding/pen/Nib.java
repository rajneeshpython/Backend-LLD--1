package LLD_Machine_Coding.pen;

public class Nib {
    private int sizeMM;
    private String material;

    public Nib(int sizeMM, String material) {
        this.sizeMM = sizeMM;
        this.material = material;
    }

    public int getSizeMM() {
        return sizeMM;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Nib{" +
                "sizeMM=" + sizeMM +
                ", material='" + material + '\'' +
                '}';
    }
}
