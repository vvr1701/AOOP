package com.Bank;

public class BankTransactionSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); // initial balance
        BankAccountManager manager = new BankAccountManager(account);

        // Create multiple threads to simulate concurrent transactions
        Thread thread1 = new UserThread(manager, 500.0, true); // deposit 500
        Thread thread2 = new UserThread(manager, 200.0, false); // withdraw 200
        Thread thread3 = new UserThread(manager, 300.0, true); // deposit 300
        Thread thread4 = new UserThread(manager, 400.0, false); // withdraw 400

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}