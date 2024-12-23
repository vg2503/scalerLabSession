package InventoryManagement;

import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {
    private LinkedList<Item> recentlyViewedItems;
    private int size = 3;
    public RecentlyViewedItems(int size) {
        this.recentlyViewedItems = new LinkedList<>();
        this.size = size;
    }
    public void AddItems(Item item) {
        if(recentlyViewedItems.size() < size) {
            if(recentlyViewedItems.contains(item)) {
                recentlyViewedItems.remove(item);
                recentlyViewedItems.addFirst(item);
            }
            else{
                recentlyViewedItems.addFirst(item);
            }
        }
        else{
            recentlyViewedItems.removeLast();
            recentlyViewedItems.addFirst(item);
        }
    }

    public List<Item> getAllRecentItem(){
        List<Item> lst = new LinkedList<>();
        for (Item recentlyViewedItem : recentlyViewedItems) {
            lst.add(recentlyViewedItem);
        }
        return lst;
    }

}
