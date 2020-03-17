package com.wyrhero.java8.lambda;

@FunctionalInterface
public interface CustomFunctional<T> {
    boolean test(T t);
}
