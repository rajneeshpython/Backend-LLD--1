package InventoryManagementSystem;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Electronics electronics = new Electronics("E01", "Laptop", 1500, 5, 2);
        Book book = new Book("E02", "Book", 100, 10, "Author");;
        Clothing clothing =  new Clothing("E03", "Shirt", 50, 20, "M");

        LinkedList<Item> items = new LinkedList<>();
        items.add(electronics);
        items.add(book);
        items.add(clothing);
        for (Item item : items) {
            System.out.println(item.getId() + " -- " + item.getName() + " -- " + item.getPrice());
        }

        System.out.println("Sort by price");
        Collections.sort(items);
        for (Item item : items) {
            System.out.println(item.getId() + " -- " + item.getName() + " -- " + item.getPrice());
        }

        System.out.println("Using Inventory management system");
        Inventory<Electronics> electronicsInventory = new Inventory<>();

        Electronics laptop = new Electronics("E04", "Laptop", 1500, 5, 2);
        Electronics smartphone = new Electronics("E04", "Smartphone", 1000, 3, 2);
        Electronics tablet = new Electronics("E06", "Tablet", 800, 0, 2);
        electronicsInventory.addItem(laptop);
        electronicsInventory.addItem(smartphone);
        electronicsInventory.addItem(tablet);

        System.out.println("All items");
        Collection<Electronics> allItems = electronicsInventory.getAllItems();
        for (Electronics electronics1 : allItems) {
            System.out.println(electronics1.getId() + " -- " + electronics1.getName() + " -- " + electronics1.getPrice());
        }

        System.out.println("Search in Electronic Inventory");
        Electronics e1 = electronicsInventory.getItem("E04");
        System.out.println("Search Item : " + e1.getName());

        // Type safety
        Book hindiBook = new Book("E07", "Hindi Book", 200, 15, "Prem Chand");
//        electronicsInventory.addItem(hindiBook);

        System.out.println("Recently viewed items");
        RecentlyViewItems recentlyViewItems = new RecentlyViewItems();
        recentlyViewItems.addRecentlyViewedItem(laptop);
        recentlyViewItems.addRecentlyViewedItem(smartphone);
        recentlyViewItems.addRecentlyViewedItem(tablet);
        recentlyViewItems.addRecentlyViewedItem(laptop);
        recentlyViewItems.addRecentlyViewedItem(laptop);
        recentlyViewItems.addRecentlyViewedItem(smartphone);

        for (Item item : recentlyViewItems.getRecentlyViewedItems()) {
            System.out.println(item.getId() + " -- " + item.getName() + " -- " + item.getPrice());
        }

        System.out.println("Oder and Order processor");
        ProcessOrder processOrders = new ProcessOrder();

        Order order1 = new Order("o1", true);
        Order order2 = new Order("o2", false);
        Order order3 = new Order("o3", true);
        Order order4 = new Order("o4", false);

        processOrders.addOrder(order1);
        processOrders.addOrder(order2);
        processOrders.addOrder(order3);
        processOrders.addOrder(order4);

        System.out.println("Print order placed");
        while (processOrders.getSize() > 0){
            Order order = processOrders.processOrder();
            System.out.println(order);
        }

        System.out.println("Sorting and Filtering Items(Custom Comprator)");
        Inventory<Item> inventory = new Inventory<>();
        inventory.addItem(electronics);
        inventory.addItem(book);
        inventory.addItem(clothing);
        inventory.addItem(laptop);
        inventory.addItem(smartphone);
        inventory.addItem(tablet);

        System.out.println("All Items");
        for (Item item : inventory.getAllItems()) {
            System.out.println(item.getId() + " -- " + item.getName() + " -- " + item.getPrice());
        }

        System.out.println("Filter quantity");
        List<Item> avilableItems = inventory.filterByAvailability();
        System.out.println("Size : " + avilableItems.size());
        for (Item item : avilableItems) {
            System.out.println(item.getId() + " -- " + item.getName() + " -- " + item.getQuantity());
        }

        System.out.println("Filter by price range");
        List<Item> itemsInPriceRange = inventory.filterByPriceRange(100, 1000);
        System.out.println("Size : " + itemsInPriceRange.size());
        for (Item item : itemsInPriceRange) {
            System.out.println("id : " + item.getId() + " name : " + item.getName() + " price : " + item.getPrice() + "");
        }

        List<Item> sortedItemsByNames = inventory.sortItems(new ItemNameComparator());
        System.out.println("Sorted by names");
        for (Item item : sortedItemsByNames) {
            System.out.println(item.getId() + " -- " + item.getName() + " -- " + item.getPrice());
        }

        List<Item> sortedItemsByQuantity = inventory.sortItems(new ItemQuantityComparator());
        System.out.println("Sorted by quantity");
        for (Item item : sortedItemsByQuantity) {
            System.out.println(item.getId() + " -- " + item.getName() + " -- " + item.getQuantity());
        }

        System.out.println("Wishlist");
        WishList itemWishList = new WishList();
        itemWishList.addToWishlist(book);
        itemWishList.addToWishlist(clothing);
        itemWishList.addToWishlist(electronics);
        itemWishList.addToWishlist(smartphone);
        itemWishList.addToWishlist(tablet);
        itemWishList.addToWishlist(laptop);
        itemWishList.addToWishlist(book);

        Set<Item> wishList = itemWishList.getWishList();
        for (Item item : wishList) {
            System.out.println(item.getId() + " -- " + item.getName());
        }

        wishList.remove(book);
        System.out.println("Wishlist after removing book");
        for (Item item : wishList) {
            System.out.println(item.getId() + " -- " + item.getName());
        }
    }
}
