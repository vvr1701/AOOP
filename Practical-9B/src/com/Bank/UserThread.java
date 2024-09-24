package com.Bank;

public class UserThread extends Thread {
    private BankAccountManager manager;
    private double amount;
    private boolean isDeposit;

    public UserThread(BankAccountManager manager, double amount, boolean isDeposit) {
        this.manager = manager;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    @Override
    public void run() {
        manager.performTransaction(amount, isDeposit);
    }
}