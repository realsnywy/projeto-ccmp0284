package br.com.primeshoes.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int orderId;
    private int variationId;
    private int quantity;
    private float subtotal;

    public OrderItem(int orderId, int variationId, int quantity, float subtotal) {
        this.orderId = orderId;
        this.variationId = variationId;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }

    public int getVariationId() {
        return variationId;
    }

    public float getSubtotal() {
        return subtotal;
    }
}