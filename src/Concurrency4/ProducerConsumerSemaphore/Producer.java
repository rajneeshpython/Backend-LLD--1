package Concurrency4.ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

/**
 * The Producer class represents a producer in the producer-consumer problem.
 * It continuously produces items and adds them to the shared Store while
 * managing concurrency using semaphores to ensure synchronization with consumers.
 */
public class Producer implements Runnable {
    private final Store store;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    /**
     * Constructs a Producer instance.
     *
     * @param store             the shared resource (Store) where items will be added
     * @param producerSemaphore the semaphore to control producer access to the Store
     * @param consumerSemaphore the semaphore to signal consumer availability
     */
    public Producer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    /**
     * Continuously produces items and adds them to the shared Store.
     * It uses the producer semaphore to wait for available slots in the Store
     * and the consumer semaphore to notify consumers about the availability of items.
     */
    @Override
    public void run() {
        while (true) {
            try {
                producerSemaphore.acquire();
                store.addItem(new Object());
                consumerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

