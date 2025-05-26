package Concurrency2.AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Multi threaded adder and subtractor");

        Value value = new Value();
        value.setValue(0);

        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Void> futureAdder = executorService.submit(adder);
        Future<Void> futureSubtractor = executorService.submit(subtractor);

        futureAdder.get();
        futureSubtractor.get();

        executorService.shutdown();

        // Final value should be 0, but this is NOT guaranteed because
        // we have not handled synchronization here.
        System.out.println("Final value is: " + value.getValue());
    }
}

