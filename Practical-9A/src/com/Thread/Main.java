package com.Thread;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintTwo());
        Thread t2 = new Thread(new PrintThree());
        Thread t3 = new Thread(new PrintFour());
        Thread t4 = new Thread(new PrintFive());
        Thread t5 = new Thread(new PrintNumber());

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
