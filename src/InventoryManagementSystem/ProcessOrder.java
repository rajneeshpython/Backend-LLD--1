package InventoryManagementSystem;

import java.util.PriorityQueue;
import java.util.Queue;

public class ProcessOrder {
    private Queue<Order> orders;
    
    public ProcessOrder(){
        this.orders = new PriorityQueue<>();
    }

    public void addOrder(Order order){
        orders.offer(order);
    }

    public Order processOrder(){
        return orders.poll();
    }

    public int getSize(){
        return orders.size();
    }
}
