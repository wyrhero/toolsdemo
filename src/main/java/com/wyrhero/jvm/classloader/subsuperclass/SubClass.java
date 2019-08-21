package com.wyrhero.jvm.classloader.subsuperclass;

public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }
}
