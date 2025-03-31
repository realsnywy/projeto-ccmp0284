package br.com.primeshoes.api.dtos;

public record OrderItemDTO(
    int id,
    int orderId,
    int variationId,
    int quantity,
    float subtotal
) {}
