package Concurrency2.Sorter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * The Sorter class implements the Callable interface and performs a multithreaded merge sort.
 * Each instance of Sorter handles the sorting of a portion of the array.
 */
public class Sorter implements Callable<List<Integer>> {
    private List<Integer> array;
    private ExecutorService executorService;

    /**
     * Constructs a Sorter object with the given array.
     *
     * @param array The portion of the array to be sorted.
     * @param executorService The ExecutorService used to manage thread execution.
     */
    public Sorter(List<Integer> array, ExecutorService executorService) {
        this.array = array;
        this.executorService = executorService;
    }

    /**
     * Sorts the list using the merge sort algorithm, splitting the list into
     * two halves and sorting each half in a separate thread.
     *
     * @return A sorted list of integers.
     * @throws Exception If any error occurs during the sorting process.
     */
    @Override
    public List<Integer> call() throws Exception {
        // Base case: If the list has 1 or no elements, it is already sorted.
        if (this.array.size() <= 1) {
            return this.array;
        }

        // Split the array into two halves: left and right.
        int mid = this.array.size() / 2;
        List<Integer> left = this.array.subList(0, mid);
        List<Integer> right = this.array.subList(mid, this.array.size());

        // Create two sorter tasks for the left and right halves.
        Sorter leftArraySorter = new Sorter(left, executorService);
        Sorter rightArraySorter = new Sorter(right, executorService);

        // Execute the sorter tasks in separate threads using a thread pool.
        Future<List<Integer>> leftFutureArray = executorService.submit(leftArraySorter);
        Future<List<Integer>> rightFutureArray = executorService.submit(rightArraySorter);

        // Wait for the sorted results from both tasks.
        List<Integer> leftSortedArray = leftFutureArray.get();
        List<Integer> rightSortedArray = rightFutureArray.get();

        // Merge the two sorted halves into a single sorted list.
        List<Integer> sortedArray = new ArrayList<>();
        int i = 0, j = 0;

        // Perform the merge by comparing elements from the left and right sorted lists.
        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) <= rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i++));
            } else {
                sortedArray.add(rightSortedArray.get(j++));
            }
        }

        // Add any remaining elements from the left sorted array to the merged list.
        while (i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i++));
        }

        // Add any remaining elements from the right sorted array to the merged list.
        while (j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j++));
        }
        
        // Return the fully sorted array.
        return sortedArray;
    }
}


