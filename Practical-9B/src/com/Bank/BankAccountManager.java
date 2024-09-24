package com.Bank;

public class BankAccountManager {
    private BankAccount account;

    public BankAccountManager(BankAccount account) {
        this.account = account;
    }

    public void performTransaction(double amount, boolean isDeposit) {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}