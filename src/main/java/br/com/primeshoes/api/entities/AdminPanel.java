package br.com.primeshoes.api.entities;

import java.util.ArrayList;
import java.util.List;

public class AdminPanel {
    private List<User> users;
    private List<Product> products;
    private Report report;

    public AdminPanel() {
        this.users = new ArrayList<>();
        this.products = new ArrayList<>();
        this.report = new Report();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public List<User> manageUsers() {
        return users;
    }

    public List<Product> manageProducts() {
        return products;
    }

    public Report viewReports() {
        return report;
    }
}