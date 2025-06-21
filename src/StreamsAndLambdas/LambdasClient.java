package StreamsAndLambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdasClient {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println( "Hello World");
        //Runnable runnable = () -> {System.out.println("Hello World");};
        Thread thread = new Thread(runnable);
        thread.start();

        List<Integer> l = new ArrayList<>();
        l.add(11);
        l.add(27);
        l.add(13);
        l.add(40);
        l.add(35);
        l.add(8);
        l.add(18);

        System.out.println(l);
        // Even number
        Collections.sort(l, (a, b) -> {
            if (a % 2 == 0 && b % 2 == 0) {
                return b - a;
            }
            else if (a % 2 == 0) {
                return -1;
            }
            else {
                return 1;
            }
        });

        System.out.println(l);
    }
}
