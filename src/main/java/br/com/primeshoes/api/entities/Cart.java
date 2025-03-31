package br.com.primeshoes.api.entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int id;
    private int userId;
    private List<CartItem> items;

    public Cart(int userId) {
        this.userId = userId;
        this.items = new ArrayList<>();
    }

    public void addItem(int variationId, int quantity) {
        this.items.add(new CartItem(variationId, quantity));
    }

    public void removeItem(int variationId) {
        this.items.removeIf(item -> item.getVariationId() == variationId);
    }

    public void clearCart() {
        this.items.clear();
    }

    public float getTotalPrice() {
        float total = 0.0f;
        for (CartItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }
}