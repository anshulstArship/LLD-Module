package com.structural.adapter;

import com.structural.adapter.external.PayUAPI;
import com.structural.adapter.external.PayUStatus;

public class PayUAdapter implements PaymentProvider{

    PayUAPI payuApi = new PayUAPI();
    @Override
    public void createPayment(PaymentRequest request) {
        payuApi.makePayment(request.getId(), request.getAmount());

    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        PayUStatus status = payuApi.getStatus(id);
        return to(status);
    }

    private PaymentStatus to(PayUStatus status) {
        switch (status){
            case SUCCESS : return PaymentStatus.DONE;
            case FAILURE: return PaymentStatus.FAILED;
        }
        throw new IllegalArgumentException("Wrong Status");
    }
}
