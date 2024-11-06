package com.structural;

import com.structural.adapter.PaymentProvider;
import com.structural.adapter.PaymentStatus;
import com.structural.adapter.RazorPayAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentProviderTest {
    PaymentProvider provider = new RazorPayAdapter();
    @Test
    public void testCreatePayment(){

        provider.createPayment(1L,"Anshul","abc",100.0);
    }

    @Test
    public void testStatus(){
        PaymentStatus status = provider.verifyStatus(1L);
        Assertions.assertEquals(PaymentStatus.DONE,status);
    }
}
