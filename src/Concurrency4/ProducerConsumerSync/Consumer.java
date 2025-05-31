package Concurrency4.ProducerConsumerSync;

public class Consumer implements Runnable {
    private final Store store;

    public Consumer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            synchronized (store) {
                if (store.getSize() > 0) {
                    store.removeItem();
                }
            }
        }
    }
}

