package design_pattern.factory;

/**
 * Created  by liuqingjie on 2019/4/9 .
 */
public class Demo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("circle");
        circle.draw();
        Shape square = factory.getShape("square");
        square.draw();
        Shape rect = factory.getShape("rectangle");
        rect.draw();

    }
}
