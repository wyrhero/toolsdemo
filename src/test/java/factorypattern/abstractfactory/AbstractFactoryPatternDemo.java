package factorypattern.abstractfactory;

import com.wyrhero.designpattern.factorypattern.abstractfactory.Constants.FactoryType;
import com.wyrhero.designpattern.factorypattern.abstractfactory.Constants.ProductType;
import com.wyrhero.designpattern.factorypattern.abstractfactory.factory.AbstractFactory;
import com.wyrhero.designpattern.factorypattern.abstractfactory.factory.impl.ColorFactory;
import com.wyrhero.designpattern.factorypattern.abstractfactory.producer.FactoryProducer;
import com.wyrhero.designpattern.factorypattern.abstractfactory.product.Color;
import com.wyrhero.designpattern.factorypattern.abstractfactory.product.Shape;
import org.junit.Test;

public class AbstractFactoryPatternDemo {

    @Test
    public void testShapeFactory() {
        //获取Shape工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);

        Shape circleShape = shapeFactory.getShape(ProductType.ShapeProduct.CIRCLE);
        circleShape.draw();

        Shape rectangleShape = shapeFactory.getShape(ProductType.ShapeProduct.RECTANGLE);
        rectangleShape.draw();

        Shape squareShape = shapeFactory.getShape(ProductType.ShapeProduct.SQUARE);
        squareShape.draw();


        //获取Color工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);

        Color blueColor = colorFactory.getColor(ProductType.ColorProduct.BLUE);
        blueColor.fill();

        Color redColor = colorFactory.getColor(ProductType.ColorProduct.RED);
        redColor.fill();

        Color greenColor = colorFactory.getColor(ProductType.ColorProduct.GREEN);
        greenColor.fill();




    }
}
