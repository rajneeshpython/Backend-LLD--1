package InventoryManagementSystem;

import java.util.HashSet;
import java.util.Set;

public class WishList {
    private final Set<Item> wishListItems;

    public WishList() {
        this.wishListItems = new HashSet<>();
    }

    public void addToWishlist(Item item) {
        wishListItems.add(item);
    }

    public void removeFromWishlist(Item item) {
        wishListItems.remove(item);
    }

    public Set<Item> getWishList() {
        return new HashSet<>(wishListItems);
    }
}
