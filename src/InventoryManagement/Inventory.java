package InventoryManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory <T extends Item>{
    private HashMap<String,T> inventoryItems;
    public Inventory(){
        inventoryItems = new HashMap<>();
    }
    public void addItem(T item){
        inventoryItems.put(item.getId(), item);
    }

    public void removeItem(String id){
        inventoryItems.remove(id);
    }

    public T getItem(String id){
        return inventoryItems.get(id);
    }

    public List<T> getItems(){
        List<T> items = new ArrayList<>();
        for(T item : inventoryItems.values()){
            items.add(item);
        }
        return items;
    }
}
