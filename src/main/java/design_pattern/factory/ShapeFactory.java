package design_pattern.factory;

/**
 * Created  by liuqingjie on 2019/4/9 .
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType ==null)
            return null;
        if(shapeType.equalsIgnoreCase("circle")){
           return  new Circle();
        }
        if(shapeType.equalsIgnoreCase("rectangle")){
            return  new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
