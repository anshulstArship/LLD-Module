package com.structural.adapter;
// Step 1
public interface PaymentProvider {
    void createPayment(Long id, String name, String email, Double amount);
    PaymentStatus verifyStatus(Long id);
}
