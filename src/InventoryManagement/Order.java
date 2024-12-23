package InventoryManagement;

public class Order implements Comparable<Order> {
    private int orderID;
    private String orderType;

    public Order(int orderID, String orderType){
        this.orderID = orderID;
        this.orderType = orderType;
    }

    public int compareTo(Order o){
        if(this.orderType.compareTo("express") == 0 && o.orderType.compareTo("express") == 0){
            return this.orderID - o.orderID;
        }
        else if(this.orderType.compareTo("express") == 0){
            return -1;
        }
        else{
            return 1;
        }
    }

}
