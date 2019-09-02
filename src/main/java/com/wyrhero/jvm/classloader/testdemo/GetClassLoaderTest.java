package com.wyrhero.jvm.classloader.testdemo;

public class GetClassLoaderTest {
    //双亲委派模型加载
    public static void main(String[] args) {
        System.out.println(GetClassLoaderTest.class.getClassLoader());
        System.out.println(GetClassLoaderTest.class.getClassLoader().getParent());
        System.out.println(GetClassLoaderTest.class.getClassLoader().getParent().getParent());
    }
}
