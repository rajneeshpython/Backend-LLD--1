package designpattern.singleton;

public class Main {
    public static void main(String[] args) {
        LoggerTask loggerTask = new LoggerTask();
        LoggerTask loggerTask1 = new LoggerTask();
        LoggerTask loggerTask2 = new LoggerTask();
        LoggerTask loggerTask3 = new LoggerTask();

        Thread loggerTaskThread = new Thread(loggerTask, "Thread-1");
        Thread loggerTaskThread1 = new Thread(loggerTask1, "Thread-2");
        Thread loggerTaskThread2 = new Thread(loggerTask2, "Thread-3");
        Thread loggerTaskThread3 = new Thread(loggerTask3, "Thread-4");

        loggerTaskThread.start();
        loggerTaskThread1.start();
        loggerTaskThread2.start();
        loggerTaskThread3.start();
    }
}
