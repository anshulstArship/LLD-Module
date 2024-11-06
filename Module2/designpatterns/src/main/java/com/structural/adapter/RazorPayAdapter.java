package com.structural.adapter;

import com.structural.adapter.external.RazorPayAPI;
import com.structural.adapter.external.RazorPayStatus;

public class RazorPayAdapter implements PaymentProvider {

    private RazorPayAPI razorPayApi = new RazorPayAPI();
    @Override
    public void createPayment(PaymentRequest request) {
        razorPayApi.pay(request.getId(), request.getName(), request.getEmail(), request.getAmount());

    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        RazorPayStatus status = razorPayApi.checkStatus(id);
        return to(status); // Transformer
    }

    private PaymentStatus to(RazorPayStatus status) {
        switch (status){
            case OK : return PaymentStatus.DONE;
            case ERROR: return PaymentStatus.FAILED;
        }
        throw new IllegalArgumentException("Wrong status");
    }
}
