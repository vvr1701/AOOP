package com.Thread;

public class PrintNumber implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized (SharedResource.lock) {
                if (SharedResource.number > SharedResource.MAX_NUMBER) return;
                if (SharedResource.number % 2 != 0 && SharedResource.number % 3 != 0 && SharedResource.number % 4 != 0 && SharedResource.number % 5 != 0) {
                    System.out.println("Number: " + SharedResource.number);
                    SharedResource.number++;
                    SharedResource.lock.notifyAll(); // Notify other waiting threads
                } else {
                    try {
                        SharedResource.lock.wait(); // Wait if condition is not met
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
