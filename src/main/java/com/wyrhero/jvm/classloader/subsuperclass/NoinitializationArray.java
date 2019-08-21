package com.wyrhero.jvm.classloader.subsuperclass;

/**
 * 通过定义来引用类，不会触发此类的初始化
 */
public class NoinitializationArray {
    public static void main(String[] args) {
        SuperClass[] spArray = new SuperClass[10];
    }
}
