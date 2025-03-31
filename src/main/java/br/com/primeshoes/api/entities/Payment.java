package br.com.primeshoes.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int orderId;
    private String paymentMethod;
    private String transactionId;
    private float amount;
    private String status;
    private Date createdAt;

    public boolean processPayment() {
        this.status = "Completed";
        this.transactionId = "TXN" + (int) (Math.random() * 10000);
        return true;
    }
}