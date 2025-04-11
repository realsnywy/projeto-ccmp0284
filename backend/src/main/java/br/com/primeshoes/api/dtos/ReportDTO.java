package br.com.primeshoes.api.dtos;

import java.time.LocalDate;

public record ReportDTO(Long id, String title, String description, LocalDate createdDate) {
}