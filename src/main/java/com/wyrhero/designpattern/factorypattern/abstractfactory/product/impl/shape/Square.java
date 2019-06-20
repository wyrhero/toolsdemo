package com.wyrhero.designpattern.factorypattern.abstractfactory.product.impl.shape;

import com.wyrhero.designpattern.factorypattern.abstractfactory.product.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape::Square draw()");
    }
}
