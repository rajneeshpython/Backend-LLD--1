package Concurrency2.ArrayCreator;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        ArrayCreator arrayCreator = new ArrayCreator(size);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<List<Integer>> listFuture = executorService.submit(arrayCreator);
        List<Integer> list = listFuture.get();
        executorService.shutdown();
        System.out.println(list);

    }
}
