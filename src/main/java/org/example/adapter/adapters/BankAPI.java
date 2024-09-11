package org.example.adapter.adapters;

public interface BankAPI {
    double checkBalance();
    boolean pay(int amount, String from, String to);
}
