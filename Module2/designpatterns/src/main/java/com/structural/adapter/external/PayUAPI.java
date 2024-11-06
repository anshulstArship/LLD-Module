package com.structural.adapter.external;

//SDK
public class PayUAPI {

    public void makePayment(Long id, Double amount){
        System.out.println("PAYU API");
    }

    public PayUStatus getStatus(Long id){
        return PayUStatus.SUCCESS;
    }

}
