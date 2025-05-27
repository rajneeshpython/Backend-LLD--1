package Concurrency2.BinaryTree;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    private final Node root;
    private final ExecutorService executorService;

    TreeSizeCalculator(Node root, ExecutorService executorService){
        this.root = root;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception {
        if(root == null){
            return 0;
        }

        TreeSizeCalculator leftSubtreeCalculator = new TreeSizeCalculator(root.left, executorService);
        TreeSizeCalculator rightSubtreeCalculator = new TreeSizeCalculator(root.right, executorService);

        Future<Integer> futureLeftSubtree = executorService.submit(leftSubtreeCalculator);
        Future<Integer> futureRightSubtree = executorService.submit(rightSubtreeCalculator);

        int leftSubtreeSize = futureLeftSubtree.get();
        int rightSubtreeSize = futureRightSubtree.get();

        return leftSubtreeSize + rightSubtreeSize + 1;
    }
}


