package com.structural;

import com.structural.adapter.PaymentProvider;
import com.structural.adapter.PaymentRequest;
import com.structural.adapter.PaymentStatus;
import com.structural.adapter.RazorPayAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentProviderTest {
    PaymentProvider provider = new RazorPayAdapter();
    @Test
    public void testCreatePayment(){

        provider.createPayment(PaymentRequest.builder().id(1L).name("Anshul").email("abc").amount(100.0).build());
    }

    @Test
    public void testStatus(){
        PaymentStatus status = provider.verifyStatus(1L);
        Assertions.assertEquals(PaymentStatus.DONE,status);
    }
}
