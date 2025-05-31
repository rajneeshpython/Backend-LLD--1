package Concurrency4.ProducerConsumerSemaphore;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * The Store class represents a shared resource where producers can add items,
 * and consumers can remove items. It serves as the central storage for the producer-consumer model.
 */
public class Store {

    /**
     * The maximum number of items the store can hold.
     */
    private int maxSize;

    /**
     * A list to hold items produced by Producer and consumed by Consumer.
     */
    private final ConcurrentLinkedQueue<Object> items;

    /**
     * Constructs a new Store with the specified maximum size.
     *
     * @param maxSize the maximum number of items the store can hold
     */
    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedQueue<>();
    }

    /**
     * Adds an item to the store. This method ensures the producer can add an item
     * to the current store, logging its state after the operation.
     *
     * @param item the item to be added to the store
     * @throws IllegalStateException if the store has reached its maximum capacity
     */
    public void addItem(Object item) {
        items.add(item);
        System.out.println("Producer is producing the item: " + items.size());
    }

    /**
     * Removes the most recently added item from the store. This method ensures the consumer
     * can remove an available item, logging the store's state post-consumption.
     *
     * @throws IllegalStateException if the store is empty and no items are available to consume
     */
    public void removeItem() {
        items.remove();
        System.out.println("Consumer is consuming the item: " + items.size());
    }

    /**
     * Returns the maximum number of items the store can hold.
     *
     * @return the maximum size of the store
     */
    public int getMaxSize() {
        return maxSize;
    }
}
