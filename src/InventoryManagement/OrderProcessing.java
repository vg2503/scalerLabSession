package InventoryManagement;

import java.util.PriorityQueue;

public class OrderProcessing {
    private PriorityQueue<Order> orderProcessingQueue;
    public OrderProcessing() {
        orderProcessingQueue = new PriorityQueue<>();
    }

    public void AddOrderForProcessing(Order order) {
        orderProcessingQueue.add(order);
    }
}
