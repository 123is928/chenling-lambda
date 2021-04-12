package com.chenling;

import java.util.concurrent.Callable;

public class Lambda_01 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": running..." + i);
            }
        };

        for (int i = 0; i < 10; i++) {
            //new Thread(runnable).start();
        }

        Callable<String> c = ()-> {
            return "call";
        };

        Callable<String> c1 = ()-> "call";
        try {
            System.out.println(c.call());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
