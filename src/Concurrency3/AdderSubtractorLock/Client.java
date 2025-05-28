package Concurrency3.AdderSubtractorLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Multi threaded adder and subtractor");

        // Shared value object for addition and subtraction
        Value value = new Value();
        value.setValue(0);

        // Initializing a lock for thread-safe operations
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(value, lock);
        Subtractor subtractor = new Subtractor(value, lock);

        // Creating an ExecutorService with a thread pool of 2 threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submitting the adder and subtractor tasks for execution
        Future<Void> futureAdder = executorService.submit(adder);
        Future<Void> futureSubtractor = executorService.submit(subtractor);

        // Waiting for both tasks to complete
        futureAdder.get();
        futureSubtractor.get();

        // Shutting down the executor service
        executorService.shutdown();

        System.out.println("Final value is: " + value.getValue());
    }
}



