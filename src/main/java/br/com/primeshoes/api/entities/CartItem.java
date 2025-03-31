package br.com.primeshoes.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cartId;
    private int variationId;
    private int quantity;
    private float subtotal;

    public CartItem(int variationId, int quantity) {
        this.variationId = variationId;
        this.quantity = quantity;
        this.subtotal = calculateSubtotal();
    }

    private float calculateSubtotal() {
        return this.quantity * 10.0f; // Preço fictício de 10.0 por unidade
    }

    public int getVariationId() {
        return variationId;
    }

    public float getSubtotal() {
        return subtotal;
    }
}