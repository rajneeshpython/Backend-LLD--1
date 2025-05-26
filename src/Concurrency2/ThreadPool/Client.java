package Concurrency2.ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Hello World from : " + Thread.currentThread().getName() + "");

//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        ExecutorService executorService = Executors.newCachedThreadPool();
//
//
//        for (int i = 0; i < 100; i++) {
//            executorService.execute(new NumberPrinter(i));
//        }
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            Future<Integer> integerFuture =executorServiceNewCachedThreadPool.submit(new NumberGenerator(i));
            Integer getInteger = integerFuture.get();
            System.out.println(i + " multiply by * 5 = " + getInteger);
        }

    }
}
