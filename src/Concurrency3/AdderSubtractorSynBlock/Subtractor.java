package Concurrency3.AdderSubtractorSynBlock;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value value;
    Subtractor(Value value)
    {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {

        for (int i = 0; i < 10000 ; i++) {
            synchronized (value) {
                System.out.println("Subtraction happening : " + i);
                this.value.setValue(this.value.getValue() - i);
            }
        }
        return null;
    }
}
