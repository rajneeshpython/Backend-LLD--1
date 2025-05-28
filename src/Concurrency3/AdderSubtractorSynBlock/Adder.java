package Concurrency3.AdderSubtractorSynBlock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void>{
    private Value value;

    Adder(Value value)
    {
        this.value = value;
    }

    @Override
    public Void call() {
        for (int i = 0; i < 10000 ; i++) {
            synchronized (value) {
                System.out.println("Addition happening : " + i);
                this.value.setValue(this.value.getValue() + i);
            }
        }
        return null;
    }
}

