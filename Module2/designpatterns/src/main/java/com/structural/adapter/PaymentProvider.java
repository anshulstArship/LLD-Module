package com.structural.adapter;
// Step 1
public interface PaymentProvider {
    void createPayment(PaymentRequest request);
    PaymentStatus verifyStatus(Long id);
}
