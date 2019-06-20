package com.wyrhero.designpattern.factorypattern.simplefactory.product.impl;

import com.wyrhero.designpattern.factorypattern.simplefactory.product.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("我是Circle");
    }
}
