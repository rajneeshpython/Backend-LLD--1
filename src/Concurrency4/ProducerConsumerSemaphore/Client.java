package Concurrency4.ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

/**
 * The Client class demonstrates the Producer-Consumer problem using Java's Semaphore.
 * <p>
 * It creates multiple producer and consumer threads to simulate concurrent production
 * and consumption of items in a shared store with limited capacity.
 */
public class Client {

    /**
     * The main entry point of the application.
     * <p>
     * This method initializes the shared store and semaphores, and creates producer
     * and consumer threads to work concurrently on the shared store.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a shared store with a fixed capacity of 5 items.
        Store store = new Store(5);

        // Create semaphores to manage producer and consumer operations.
        // The producerSemaphore controls how many items can be added to the store.
        Semaphore producerSemaphore = new Semaphore(store.getMaxSize());

        // The consumerSemaphore ensures items are consumed only when available.
        Semaphore consumerSemaphore = new Semaphore(0);

        // Create and start 10 producer threads.
        for (int i = 0; i < 10; i++) {
            Producer producer = new Producer(store, producerSemaphore, consumerSemaphore);
            Thread producerThread = new Thread(producer);
            producerThread.start();
        }

        // Create and start 20 consumer threads.
        for (int i = 0; i < 20; i++) {
            Consumer consumer = new Consumer(store, producerSemaphore, consumerSemaphore);
            Thread consumerThread = new Thread(consumer);
            consumerThread.start();
        }
    }
}



