package com.wyrhero.designpattern.factorypattern.abstractfactory.factory;

import com.wyrhero.designpattern.factorypattern.abstractfactory.product.Color;
import com.wyrhero.designpattern.factorypattern.abstractfactory.product.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
