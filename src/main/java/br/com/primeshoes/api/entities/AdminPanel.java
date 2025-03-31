package br.com.primeshoes.api.entities;

import java.util.ArrayList;
import java.util.List;

public class AdminPanel {
    public List<User> manageUsers() {
        return new ArrayList<>();
    }

    public List<Product> manageProducts() {
        return new ArrayList<>();
    }

    public Report viewReports() {
        return new Report();
    }
}