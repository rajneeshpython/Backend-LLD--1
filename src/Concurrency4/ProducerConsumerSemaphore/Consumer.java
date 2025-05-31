package Concurrency4.ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

/**
 * The Consumer class represents a consumer in the producer-consumer problem.
 * It consumes items from the store using synchronization via Semaphores.
 */
public class Consumer implements Runnable {
    private final Store store;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    /**
     * Constructs a Consumer with the given components.
     *
     * @param store             the shared store to consume items from
     * @param producerSemaphore the semaphore controlling producer access
     * @param consumerSemaphore the semaphore controlling consumer access
     */
    public Consumer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    /**
     * Continuously consumes items from the store, respecting synchronization constraints.
     * The method waits for permission via the consumer Semaphore, removes an item from
     * the store, and then signals the producer Semaphore to allow production.
     */
    @Override
    public void run() {
        while (true) {
            try {
                consumerSemaphore.acquire();
                store.removeItem();
                producerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


