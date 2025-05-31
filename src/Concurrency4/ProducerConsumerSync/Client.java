package Concurrency4.ProducerConsumerSync;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);

        for (int i = 0; i < 10; i++) {
            Producer producer = new Producer(store);
            Thread producerThread = new Thread(producer);
            producerThread.start();
        }

        for (int i = 0; i < 10; i++) {
            Consumer consumer = new Consumer(store);
            Thread consumerThread = new Thread(consumer);
            consumerThread.start();
        }
    }
}
