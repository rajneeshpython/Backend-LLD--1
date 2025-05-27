package Concurrency2.ArrayCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {
    private int size;
    private List<Integer> list;

    public ArrayCreator(int size) {
        this.size = size;
        this.list = new ArrayList<>();
    }

    @Override
    public List<Integer> call() throws Exception {
        for (int i = 1; i <= size; i++) {
            list.add(i);
        }
        return list;
    }
}
