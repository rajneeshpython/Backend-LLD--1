package InventoryManagementSystem;

import java.util.*;

public class Inventory<T extends Item> {
    HashMap<String, T> items;

    public Inventory(){
        this.items = new HashMap<>();
    }

    public void addItem(T item){
        this.items.put(item.getId(), item);

    }
    public void removeItem(T item){
        this.items.remove(item.getName());
    }
    public T getItem(String id){
        return this.items.get(id);
    }

    public List<T> getAllItems(){
        return new ArrayList<>(this.items.values());
    }

    public List<T> filterByPriceRange(double minPrice, double maxPrice){
        List<T> filteredItems = new ArrayList<>();
        for(T item: this.items.values()){
            if(item.getPrice() >= minPrice && item.getPrice() <= maxPrice){
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }

    public List<T> filterByAvailability(){
        List<T> filteredItems = new ArrayList<>();
        for(T item : this.items.values()){
            if (item.getQuantity() > 0){
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }

    public List<T> sortItems(Comparator<T> comparator){
        List<T> sortedItems = new ArrayList<>(items.values());
        Collections.sort(sortedItems, comparator);
        return sortedItems;
    }
}

