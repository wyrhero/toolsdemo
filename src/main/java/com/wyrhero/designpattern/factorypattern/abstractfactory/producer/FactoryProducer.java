package com.wyrhero.designpattern.factorypattern.abstractfactory.producer;

import com.wyrhero.designpattern.factorypattern.abstractfactory.Constants.FactoryType;
import com.wyrhero.designpattern.factorypattern.abstractfactory.factory.AbstractFactory;
import com.wyrhero.designpattern.factorypattern.abstractfactory.factory.impl.ColorFactory;
import com.wyrhero.designpattern.factorypattern.abstractfactory.factory.impl.ShapeFactory;

public class FactoryProducer {



    public static AbstractFactory getFactory(String factoryName){
        if (FactoryType.SHAPE.equalsIgnoreCase(factoryName)) {
            return new ShapeFactory();
        } else if(FactoryType.COLOR.equalsIgnoreCase(factoryName)){
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
