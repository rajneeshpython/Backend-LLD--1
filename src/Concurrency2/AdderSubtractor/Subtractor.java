package Concurrency2.AdderSubtractor;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value value;
    Subtractor(Value value){
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 0; i < 10000 ; i++) {
            this.value.setValue(this.value.getValue() - i);
        }
        return null;
    }
}
