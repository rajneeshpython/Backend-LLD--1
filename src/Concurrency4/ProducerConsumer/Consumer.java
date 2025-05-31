package Concurrency4.ProducerConsumer;

public class Consumer implements Runnable {
    private final Store store;

    public Consumer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            if(store.getSize() > 0 ) {
                store.removeItem();
            }
        }
    }
}
