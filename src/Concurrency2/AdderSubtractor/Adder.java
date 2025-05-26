package Concurrency2.AdderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void>{
    private Value value;

    Adder(Value value){
        this.value = value;
    }

    @Override
    public Void call() {
        for (int i = 0; i < 10000 ; i++) {
            this.value.setValue(this.value.getValue()+ i);
        }
        return null;
    }
}

