package br.com.primeshoes.api.repositories;

import br.com.primeshoes.api.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    Optional<Payment> findByOrderId(int orderId);
}