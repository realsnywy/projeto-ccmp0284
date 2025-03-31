package br.com.primeshoes.api.dtos;

import java.util.Date;

public record PaymentDTO(
    int id,
    int orderId,
    String paymentMethod,
    String transactionId,
    float amount,
    String status,
    Date createdAt
) {}
