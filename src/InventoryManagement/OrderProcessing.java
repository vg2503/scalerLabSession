package InventoryManagement;

import java.util.Comparator;
import java.util.PriorityQueue;

public class OrderProcessing {
    private PriorityQueue<Order> orderProcessingQueue;

    public OrderProcessing() {
        orderProcessingQueue = new PriorityQueue<>();
    }

    public OrderProcessing(Comparator<Order> comparator){
        orderProcessingQueue = new PriorityQueue<>(comparator);
    }

    public void AddOrderForProcessing(Order order) {
        orderProcessingQueue.add(order);
    }

    public Order ProcessOrder() {
        return orderProcessingQueue.poll();
    }
}
