package com.wyrhero.designpattern.factorypattern.abstractfactory.product.impl.color;

import com.wyrhero.designpattern.factorypattern.abstractfactory.product.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Color::Red fill()");
    }
}
