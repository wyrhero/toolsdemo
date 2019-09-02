package com.wyrhero.jvm.classloader.testdemo;

public class SayHello {
    public void say(){
        System.out.println("classloader---" + SayHello.class.getClassLoader());
        System.out.println("hello!");
    }
}
