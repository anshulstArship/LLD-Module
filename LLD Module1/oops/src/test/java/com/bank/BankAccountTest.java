package com.bank;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount alice = new BankAccount();
        alice.setName("Alice");
        alice.setBalance(1000.0);
        alice.setAcountNumber(1);

        BankAccount bob = new BankAccount();
        bob.setName("Bob");
        bob.setAcountNumber(2);
        bob.setBalance(2000.0);

        alice.transfer(bob,100.0);
        System.out.println(bob.getBalance());
    }
}
