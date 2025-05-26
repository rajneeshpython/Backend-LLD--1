package Concurrency2.Sorter;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Program demonstrating the use of a multi-threaded merge sort implementation.
        System.out.println("Merge Sort using Threads!");

        // Initial unsorted list of integers.
        List<Integer> list = List.of(10, 9, 8, 7, 6, 100, -10, 5, 4, 30, 2, 1);

        // Creating a cached thread pool executor service.
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Creating a Sorter task to sort the list using multiple threads.
        Sorter sorter = new Sorter(list, executorService);

        try {
            // Submitting the Sorter task and retrieving the sorted list using a Future.
            Future<List<Integer>> future = executorService.submit(sorter);
            List<Integer> sortedList = future.get();

            // Printing the sorted list to the console.
            System.out.println(sortedList);
        } finally {
            // Shutting down the executor service to release resources.
            executorService.shutdown();
        }
    }
}


