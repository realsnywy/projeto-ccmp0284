package br.com.primeshoes.api.dtos;

import java.util.Date;
import java.util.List;

public record OrderDTO(
    int id,
    int userId,
    List<OrderItemDTO> items,
    float totalPrice,
    String status,
    String paymentMethod,
    String trackingCode,
    Date createdAt
) {
    public static record OrderItemDTO(
        int productId,
        int quantity
    ) {}
}
