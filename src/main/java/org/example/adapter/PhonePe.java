package org.example.adapter;

import org.example.adapter.adapters.YesBankAPIAdapter;
import org.example.adapter.thirdParty.ICICIBankAPI;
import org.example.adapter.thirdParty.YesBankAPI;
import org.example.adapter.adapters.ICICIBankAPIAdapter;

public class PhonePe {
//    ICICIBankAPI yesBankAPI = new ICICIBankAPI();
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