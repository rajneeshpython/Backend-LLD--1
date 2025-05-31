package Concurrency4.ProducerConsumer;

public class Producer implements Runnable {
    private final Store store;

    public Producer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            if (store.getSize() < store.getMaxSize()){
                store.addItem(new Object());
            }
        }
    }
}
