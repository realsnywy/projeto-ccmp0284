package br.com.primeshoes.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private List<OrderItem> items;
    private float totalPrice;
    private String status;
    private String paymentMethod;
    private String trackingCode;
    private Date createdAt;

    public void updateStatus(String status) {
        this.status = status;
    }

    public void assignTrackingCode(String code) {
        this.trackingCode = code;
    }
}