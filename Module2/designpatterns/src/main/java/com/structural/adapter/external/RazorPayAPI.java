package com.structural.adapter.external;

// Step 0 - SDK - Wrapper over API (Provided by service provider)
public class RazorPayAPI {
    public void pay(Long id, String name, String email, Double amount){
        System.out.println("Razor Pay Payment");
    }

    public RazorPayStatus checkStatus(Long id){
        return RazorPayStatus.OK;
    }
}
