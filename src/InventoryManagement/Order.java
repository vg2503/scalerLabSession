package InventoryManagement;

public class Order implements Comparable<Order> {
    private int orderID;
    private String orderType;
    private int amount;

    public Order(int orderID, String orderType, int amount) {
        this.orderID = orderID;
        this.orderType = orderType;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
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
