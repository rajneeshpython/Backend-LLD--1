package InventoryManagementSystem;

import java.util.LinkedList;

public class RecentlyViewItems {
    private final LinkedList<Item> recentlyViewedItems;
    private final int MAX_SIZE;

    public RecentlyViewItems(){
        this.recentlyViewedItems = new LinkedList<>();
        this.MAX_SIZE = 5;
    }

    public void addRecentlyViewedItem(Item item){
        this.recentlyViewedItems.remove(item);
        this.recentlyViewedItems.add(item);
        if(this.recentlyViewedItems.size() == MAX_SIZE){
            this.recentlyViewedItems.removeLast();
        }
    }

    public LinkedList<Item> getRecentlyViewedItems() {
        return new LinkedList<>(recentlyViewedItems);
    }
}
