package com.wyrhero.junit;

public class StatisMock {

    public static boolean sayHallo(String name){
        boolean defaultResult = false;
        System.out.println("Hallo StatisMock---" + name);
        return defaultResult;
    }
}
