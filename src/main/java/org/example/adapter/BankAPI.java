package org.example.adapter;

public interface BankAPI {

    double checkBalance();
    boolean pay(int amount, String from, String to);
}
