package com.wyrhero.designpattern.factorypattern.abstractfactory.factory.impl;

import com.wyrhero.designpattern.factorypattern.abstractfactory.Constants.ProductType;
import com.wyrhero.designpattern.factorypattern.abstractfactory.factory.AbstractFactory;

import com.wyrhero.designpattern.factorypattern.abstractfactory.product.Color;
import com.wyrhero.designpattern.factorypattern.abstractfactory.product.Shape;
import com.wyrhero.designpattern.factorypattern.abstractfactory.product.impl.shape.Circle;
import com.wyrhero.designpattern.factorypattern.abstractfactory.product.impl.shape.Rectangle;
import com.wyrhero.designpattern.factorypattern.abstractfactory.product.impl.shape.Square;


public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(ProductType.ShapeProduct.CIRCLE.equalsIgnoreCase(shape)) {
            return new Circle();
        } else if(ProductType.ShapeProduct.RECTANGLE.equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if(ProductType.ShapeProduct.SQUARE.equalsIgnoreCase(shape)) {
            return new Square();
        } else {
            return  null;
        }
    }
}
