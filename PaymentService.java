package com.csc3402.project.customer.service;

import com.csc3402.project.customer.model.Payment;
import java.util.List;
import java.util.Optional;

public interface PaymentService {
    List<Payment> getAllPayments();
    Optional<Payment> getPaymentById(Integer id);
    Payment createPayment(Payment payment);
    void deletePayment(Integer id);
}