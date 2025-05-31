package Concurrency4.AdderSubtractorAtomic;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void>{
    private final Value value;

    Adder(Value value)
    {
        this.value = value;
    }

    @Override
    public Void call() {
        for (int i = 0; i < 10000 ; i++) {
            System.out.println("Addition happening : " + i);
            this.value.getValue().addAndGet(i);
        }
        return null;
    }
}

