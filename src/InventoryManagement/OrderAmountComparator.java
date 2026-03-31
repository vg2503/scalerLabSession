package InventoryManagement;

import java.util.Comparator;

public class OrderAmountComparator implements Comparator<Order> {
    //Order with more amount should be processed first, which means it should appear first..
    @Override
    public int compare(Order o1, Order o2) {
        if(o1.getAmount() > o2.getAmount()){
            return -1;
        }
        return 1;
    }
}
