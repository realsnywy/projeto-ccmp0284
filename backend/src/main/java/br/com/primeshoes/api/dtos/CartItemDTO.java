package br.com.primeshoes.api.dtos;

public record CartItemDTO(
    int id,
    int cartId,
    int variationId,
    int quantity,
    float subtotal
) {}
