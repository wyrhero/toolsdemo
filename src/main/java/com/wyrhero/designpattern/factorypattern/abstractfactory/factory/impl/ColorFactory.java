package com.wyrhero.designpattern.factorypattern.abstractfactory.factory.impl;

import com.wyrhero.designpattern.factorypattern.abstractfactory.Constants.ProductType;
import com.wyrhero.designpattern.factorypattern.abstractfactory.factory.AbstractFactory;
import com.wyrhero.designpattern.factorypattern.abstractfactory.product.Color;
import com.wyrhero.designpattern.factorypattern.abstractfactory.product.Shape;
import com.wyrhero.designpattern.factorypattern.abstractfactory.product.impl.color.Blue;
import com.wyrhero.designpattern.factorypattern.abstractfactory.product.impl.color.Green;
import com.wyrhero.designpattern.factorypattern.abstractfactory.product.impl.color.Red;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if(ProductType.ColorProduct.BLUE.equalsIgnoreCase(color)) {
            return new Blue();
        } else if(ProductType.ColorProduct.GREEN.equalsIgnoreCase(color)) {
            return new Green();
        } else if(ProductType.ColorProduct.RED.equalsIgnoreCase(color)) {
            return new Red();
        } else {
            return  null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
