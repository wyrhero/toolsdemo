package com.wyrhero.designpattern.factorypattern.simplefactory.factory;

import com.wyrhero.designpattern.factorypattern.simplefactory.product.Shape;
import com.wyrhero.designpattern.factorypattern.simplefactory.product.impl.Circle;
import com.wyrhero.designpattern.factorypattern.simplefactory.product.impl.Rectangle;
import com.wyrhero.designpattern.factorypattern.simplefactory.product.impl.Square;

public class ShapeFactory {


    public static final String CIRCLE = "CIRCLE";
    public static final String RECTANGLE = "RECTANGLE";
    public static final String SQUARE = "SQUARE";

    /**
     * 根据shapeName 获取Shape
     * @param shapeName
     * @return
     */
    public Shape getShape(String shapeName){
        if(CIRCLE.equalsIgnoreCase(shapeName)) {
            return new Circle();
        } else if(RECTANGLE.equalsIgnoreCase(shapeName)) {
            return new Rectangle();
        } else if(SQUARE.equalsIgnoreCase(shapeName)) {
            return new Square();
        } else {
            return  null;
        }
    }
}
