package Concurrency4.ProducerConsumerSync;

public class Producer implements Runnable {
    private final Store store;

    public Producer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            synchronized (store) {
                if (store.getSize() < store.getMaxSize()) {
                    store.addItem(new Object());
                }
            }
        }
    }
}
