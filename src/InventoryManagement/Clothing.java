package InventoryManagement;

public class Clothing extends Item {
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Clothing(String id, String name, double price, int quantity, String size) {
        super(id,name,price,quantity);
        this.size = size;
    }
}
