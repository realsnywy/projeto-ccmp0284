package br.com.primeshoes.api.controllers;

import br.com.primeshoes.api.dtos.PaymentDTO;
import br.com.primeshoes.api.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/{orderId}")
    public PaymentDTO getPaymentByOrderId(@PathVariable int orderId) {
        return paymentService.getPaymentByOrderId(orderId);
    }

    @PostMapping
    public PaymentDTO processPayment(@RequestBody PaymentDTO paymentDTO) {
        return paymentService.processPayment(paymentDTO);
    }
}