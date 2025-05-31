package Concurrency4.ProducerConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;

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
    private final List<Object> items;

    /**
     * Constructs a new Store with the specified maximum size.
     *
     * @param maxSize the maximum number of items the store can hold
     */
    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>(maxSize);
    }

    /**
     * Adds an item to the store.
     *
     * @param item the item to be added
     * @throws IllegalStateException if the store is full
     */
    public void addItem(Object item) {
        items.add(item);
        System.out.println("Producer is producing the item: " + items.size());
    }

    /**
     * Removes the most recently added item from the store.
     *
     * @throws IllegalStateException if the store is empty
     */
    public void removeItem() {
        items.remove(items.size() - 1);
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

