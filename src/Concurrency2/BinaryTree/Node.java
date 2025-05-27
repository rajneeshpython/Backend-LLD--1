package Concurrency2.BinaryTree;

public class Node {
    public Node left;
    public Node right;
    public int data;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    Node(){
        this.data = 0;
    }
}
