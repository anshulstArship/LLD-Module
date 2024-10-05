package com.bank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccount {
    //state
    private String name;
    private Double balance;
    private Integer acountNumber;

    //Behaviours
    public void transfer(BankAccount dest,Double amount){
        this.withdraw(amount);
        dest.deposit(amount);


    }
    private void withdraw(Double amount){
        this.balance-=amount;
    }
    private  void deposit(Double amount){
        this.balance+=amount;
    }
}
