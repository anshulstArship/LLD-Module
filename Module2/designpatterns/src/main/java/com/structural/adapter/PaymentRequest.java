package com.structural.adapter;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PaymentRequest { // DTO Class
    Long id;
    String name;
    String email;
    Double amount;
}
