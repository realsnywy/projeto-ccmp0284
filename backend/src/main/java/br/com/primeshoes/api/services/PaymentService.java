package br.com.primeshoes.api.services;

import br.com.primeshoes.api.dtos.PaymentDTO;
import br.com.primeshoes.api.entities.Payment;
import br.com.primeshoes.api.mappers.PaymentMapper;
import br.com.primeshoes.api.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PaymentMapper paymentMapper;

    public PaymentDTO getPaymentByOrderId(int orderId) {
        return paymentMapper.toDTO(paymentRepository.findByOrderId(orderId).orElseThrow(() -> new RuntimeException("Payment not found")));
    }

    public PaymentDTO processPayment(PaymentDTO paymentDTO) {
        Payment payment = paymentMapper.toEntity(paymentDTO);
        payment.processPayment();
        return paymentMapper.toDTO(paymentRepository.save(payment));
    }
}