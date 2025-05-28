package Concurrency3.AdderSubtractorSynMethod;

public class Value {
    private int value; // Field to store the current value

    // Default constructor
    Value() {
    }

    // Getter method to retrieve the current value
    public int getValue() {
        return value;
    }

    // Setter method to update the value
    public void setValue(int value) {
        this.value = value;
    }

    // Synchronized method to safely increment the value by a given amount
    public synchronized void incrementBy(int value) {
        this.value += value;
    }
}