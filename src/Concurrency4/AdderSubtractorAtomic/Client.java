package Concurrency4.AdderSubtractorAtomic;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Multi threaded adder and subtractor");

        // Shared Value object used for thread-safe addition and subtraction operations
        Value value = new Value();

        // Initializing tasks for addition and subtraction, using the shared Value object
        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        // Creating an ExecutorService to manage a pool of 2 threads for concurrent execution
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submitting the adder and subtractor tasks to the executor for concurrent execution
        Future<Void> futureAdder = executorService.submit(adder);
        Future<Void> futureSubtractor = executorService.submit(subtractor);

        // Blocking the main thread until both adder and subtractor tasks complete their execution
        futureAdder.get();
        futureSubtractor.get();

        // Shutting down the executor service to release resources and stop accepting new tasks
        executorService.shutdown();

        // Printing the final value after all addition and subtraction operations are completed
        System.out.println("Final value is: " + value.getValue());
    }
}




