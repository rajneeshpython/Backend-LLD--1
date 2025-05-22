package IntroToMultiThreading;

public class NumberPrinter implements Runnable {
    private int counter;

    NumberPrinter(int counter) {
        this.counter = counter;
    }

    void print() {
        System.out.println("Counter : " + this.counter + " from Thread : " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        print();
    }
}
