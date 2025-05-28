package Concurrency3.AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value value;
    private Lock lock;
    Subtractor(Value value, Lock lock)
    {
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {

        for (int i = 0; i < 10000 ; i++) {
            lock.lock();
            System.out.println("Subtraction happening : " + i);
            this.value.setValue(this.value.getValue() - i);
            lock.unlock();
        }
        return null;
    }
}
