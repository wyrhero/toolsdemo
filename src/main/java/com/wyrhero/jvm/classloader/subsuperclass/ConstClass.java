package com.wyrhero.jvm.classloader.subsuperclass;

/**
 * 敞亮在变异阶段会调用类的常量池中，本质上并没有引用到定义常量的类，因此不会触发定义常量的类的初始化
 */
public class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }

    public static final String HELLOWORLD = "Hello World!";

}
