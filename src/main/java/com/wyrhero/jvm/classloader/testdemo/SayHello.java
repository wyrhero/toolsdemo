package com.wyrhero.jvm.classloader.testdemo;

import java.util.ArrayList;
import java.util.List;

public class SayHello {
    public static void main(String[] args) {
        System.out.println("classloader---" + SayHello.class.getClassLoader());
        System.out.println("hello!");

        int initMoney = 200;
        int total = 0;
        for(int i = 1; i <=52; i++) {
            total += initMoney;
            initMoney++;
        }
        System.out.println(total);

        List<Integer> a = new ArrayList<>();
        a.add(1);

/*

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
*/

        //for(int i = a.size() - 1; i > 0; i--){
        /*for(int i = 0; i < a.size(); i++){
            if(a.get(i) == 3) {
                a.remove(i);
            }
        }*/

      /*  a.forEach(o->{
            if(o.equals(1)) {
                return;
            }
            System.out.println(o);
        });*/

       // System.out.println(a);
    }
}
