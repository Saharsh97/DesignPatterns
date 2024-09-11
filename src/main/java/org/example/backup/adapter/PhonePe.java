package org.example.backup.adapter;

import org.example.backup.adapter.adapters.BankAPI;
import org.example.backup.adapter.adapters.ICICIBankAPIAdapter;

public class PhonePe {
//    YesBankAPI yesBankAPI = new YesBankAPI();
//
//    public double getBalance(){
//        return yesBankAPI.getBalance();
//    }
//
//    public void doTransaction(String from, String to, int amount){
//        yesBankAPI.transferMoney(from, amount, to);
//    }


//    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
//
//    public double getBalance(){
//        return iciciBankAPI.balanceCheck();
//    }
//
//    public void doTransaction(String from, String to, int amount){
//        iciciBankAPI.sendMoney(to, from, amount);
//    }

    //    // V2
    BankAPI bankAPI = new ICICIBankAPIAdapter();

    public double getBalance(){
        return bankAPI.checkBalance();
    }

    public boolean doTransaction(String from, String to, int amount){
        return bankAPI.pay(amount, from, to);
    }
}