package com.wyrhero.designpattern.factorypattern.simplefactory.product.impl;

import com.wyrhero.designpattern.factorypattern.simplefactory.product.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("我是Rectangle");
    }
}
