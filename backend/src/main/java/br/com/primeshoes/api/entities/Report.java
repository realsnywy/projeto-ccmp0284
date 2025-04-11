package br.com.primeshoes.api.entities;

import java.time.LocalDate;

public class Report {
    private Long id;
    private String title;
    private String description;
    private LocalDate createdDate;

    public Report() {
    }

    public Report(Long id, String title, String description, LocalDate createdDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getReportData() {
        return "Report Data: [ID: " + id + ", Title: " + title + ", Description: " + description + ", Created Date: "
                + createdDate + "]";
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
