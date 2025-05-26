package Concurrency2.ThreadPool;

public class NumberPrinter implements Runnable {
    private final int number;

    NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(this.number + " from Thread : " + Thread.currentThread().getName());
    }
}
