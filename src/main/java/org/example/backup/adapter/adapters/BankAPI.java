package org.example.backup.adapter.adapters;

public interface BankAPI {

    double checkBalance();
    boolean pay(int amount, String from, String to);
}
