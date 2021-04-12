package com.chenling;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambda_02 {
    public static void main(String[] args) {
        Function<String, Integer> f = str -> {return str.length();};
        Function<String, Integer> f1 = str -> str.length();
        Function<String, Integer> f2 = String::length;

        // ========================以上写法相同=======================

        System.out.println(f.apply("hello"));
        System.out.println("============================");
        System.out.println(f2.apply("helloWorld"));
        System.out.println("============================");

        // =========================================================================
        Supplier<String> s = () -> "helloWorld";
        System.out.println(s.get());
        System.out.println("============================");

        // =========================================================================
        Consumer<String> c = str -> System.out.println(str);
        Consumer<String> c1 = System.out::println;
        c1.accept("ChenLing");



        Runnable r = () -> System.out.println(Thread.currentThread().getName() + get());
        new Thread(r).start();


    }

    static int get() {
        return 1;
    }
}
