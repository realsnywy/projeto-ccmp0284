package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.PaymentDTO;
import br.com.primeshoes.api.entities.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {

    public PaymentDTO toDTO(Payment payment) {
        return new PaymentDTO(
            payment.getId(),
            payment.getOrderId(),
            payment.getPaymentMethod(),
            payment.getTransactionId(),
            payment.getAmount(),
            payment.getStatus(),
            payment.getCreatedAt()
        );
    }

    public Payment toEntity(PaymentDTO dto) {
        Payment payment = new Payment();
        payment.setId(dto.id());
        payment.setOrderId(dto.orderId());
        payment.setPaymentMethod(dto.paymentMethod());
        payment.setTransactionId(dto.transactionId());
        payment.setAmount(dto.amount());
        payment.setStatus(dto.status());
        payment.setCreatedAt(dto.createdAt());
        return payment;
    }
}