package Concurrency2.ThreadPool;

import java.util.concurrent.Callable;

public class NumberGenerator implements Callable<Integer> {
    int number;

    NumberGenerator(int number){
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        return this.number * 5;
    }
}
