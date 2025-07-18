package designpattern.singleton;

public class LoggerTask implements  Runnable {
    @Override
    public void run() {
        Logger logger = Logger.getInstance();
        logger.log("log message logged!");
        System.out.println("Got instance: " + logger.hashCode() + " from thread: " + Thread.currentThread().getName());
    }
}
