package br.com.primeshoes.api.dtos;

import java.util.List;

public record CartDTO(
    int id,
    int userId,
    List<CartItemDTO> items,
    float totalPrice
) {
    public static record CartItemDTO(
        int variationId,
        int quantity,
        float subtotal
    ) {}
}
