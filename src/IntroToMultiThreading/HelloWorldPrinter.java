package IntroToMultiThreading;

public class HelloWorldPrinter implements Runnable{

    void print(){
        System.out.println("Hello World from : " + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        print();
    }
}
