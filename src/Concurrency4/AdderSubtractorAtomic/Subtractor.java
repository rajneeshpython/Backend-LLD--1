package Concurrency4.AdderSubtractorAtomic;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private final Value value;
   Subtractor(Value value)
    {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 0; i < 10000 ; i++) {
            System.out.println("Subtraction happening : " + i);
            this.value.getValue().addAndGet(-i);
        }
        return null;
    }
}
