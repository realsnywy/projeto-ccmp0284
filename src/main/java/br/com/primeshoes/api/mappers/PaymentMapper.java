package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.PaymentDTO;
import br.com.primeshoes.api.entities.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {

    public PaymentDTO toDTO(Payment payment) {
        PaymentDTO dto = new PaymentDTO();
        dto.id = payment.getId();
        dto.orderId = payment.getOrderId();
        dto.paymentMethod = payment.getPaymentMethod();
        dto.transactionId = payment.getTransactionId();
        dto.amount = payment.getAmount();
        dto.status = payment.getStatus();
        dto.createdAt = payment.getCreatedAt();
        return dto;
    }

    public Payment toEntity(PaymentDTO dto) {
        Payment payment = new Payment();
        payment.setId(dto.id);
        payment.setOrderId(dto.orderId);
        payment.setPaymentMethod(dto.paymentMethod);
        payment.setTransactionId(dto.transactionId);
        payment.setAmount(dto.amount);
        payment.setStatus(dto.status);
        payment.setCreatedAt(dto.createdAt);
        return payment;
    }
}