package Concurrency4.ProducerConsumerSync;

import java.util.ArrayList;
import java.util.List;

public class Store {
        private int maxSize;
        private final List<Object> items;

        public Store(int maxSize) {
            this.maxSize = maxSize;
            this.items = new ArrayList<>(maxSize);
        }

        public void addItem(Object item) {
            items.add(item);
            System.out.println("Producer is producing the item: " + items.size());
        }

        public void removeItem() {
            items.remove(items.size() - 1);
            System.out.println("Consumer is consuming the item: " + items.size());
        }

        public int getSize() {
            return items.size();
        }

        public void setMaxSize(int maxSize) {
            this.maxSize = maxSize;
        }

        public int getMaxSize() {
            return maxSize;
        }
}
