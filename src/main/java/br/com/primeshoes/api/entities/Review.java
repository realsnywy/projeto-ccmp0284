package br.com.primeshoes.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private int productId;
    private int rating;
    private String comment;
    private Date createdAt;

    public void editReview(String comment, int rating) {
        this.comment = comment;
        this.rating = rating;
    }
}