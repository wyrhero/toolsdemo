package factorypattern.simplefactory.factory;

import com.wyrhero.designpattern.factorypattern.simplefactory.factory.ShapeFactory;
import com.wyrhero.designpattern.factorypattern.simplefactory.product.Shape;
import org.junit.Test;

public class ShapeFactoryPatternDemo {

    @Test
    public void testShapeFactory() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape;
        shape = shapeFactory.getShape(ShapeFactory.CIRCLE);
        shape.draw();
        shape = shapeFactory.getShape(ShapeFactory.RECTANGLE);
        shape.draw();
        shape = shapeFactory.getShape(ShapeFactory.SQUARE);
        shape.draw();
    }
}
