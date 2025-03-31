package br.com.primeshoes.api.dtos;

public record ProductVariationDTO(
    int id,
    int productId,
    String color,
    String size,
    int stock
) {}
