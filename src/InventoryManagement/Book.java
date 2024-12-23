package InventoryManagement;

public class Book extends Item{
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String id, String name, double price, int quantity, String author) {
        super(id,name,price,quantity);
        this.author = author;
    }
}
