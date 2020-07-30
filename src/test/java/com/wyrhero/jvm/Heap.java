package com.wyrhero.jvm;

import java.util.ArrayList;
import java.util.List;

public class Heap {

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        if (a < b) {
            System.out.println("a < b");
        }
        System.out.println(a - b);
        if (a - b < 0) {
            System.out.println("a - b < 0");
        }
    }
}
