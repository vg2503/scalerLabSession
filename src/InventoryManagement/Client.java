package InventoryManagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        Clothing clothing = new Clothing("A1", "Shirts", 200, 20,"M");
        Electronics electronics = new Electronics("E1", "Laptop", 80000, 2, 2);
        Book book = new Book("B1", "Book1", 300, 30, "Paul");

        items.add(clothing);
        items.add(electronics);
        items.add(book);
        //this will compare the first object with the second one.
        //if I want the first object to come first then the compare to method should return -1
        int value = items.get(0).compareTo(items.get(1));
        Collections.sort(items);
        for(Item item : items) {
            System.out.println(item.getName());
        }

        Inventory<Item> inventory = new Inventory<>();
        inventory.addItem(new Item("20", "name", 30,44));
        System.out.println(inventory.getItems().get(0).getName());

        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems(3);
        recentlyViewedItems.AddItems(new Book("3", "book", 300, 3,"Paul"));
        recentlyViewedItems.AddItems(new Electronics("2", "Electronic", 300, 3,5));
        recentlyViewedItems.AddItems(new Book("4", "book2", 234, 30,"John"));
        recentlyViewedItems.AddItems(new Book("5", "book3", 500, 33,"Tom"));
        recentlyViewedItems.getAllRecentItem();
    }
}
