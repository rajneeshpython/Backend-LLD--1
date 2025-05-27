package Concurrency2.BinaryTree;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Binary tree size calculator");
        // Tree structure:
        //        10
        //       /  \
        //     20   30
        //       \   /  \
        //       60 40   50
        Node node = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);
        Node node4 = new Node(50);

        node.left = node1;
        node.right = node2;
        node2.left = node3;
        node2.right = node4;

        ExecutorService executorService = Executors.newCachedThreadPool();
        TreeSizeCalculator treeSizeCalculator = new TreeSizeCalculator(node, executorService);

        Future<Integer> integerFuture = executorService.submit(treeSizeCalculator);
        int treeSize = integerFuture.get();
        executorService.shutdown();
        System.out.println("Tree size is: " + treeSize);
    }
}


