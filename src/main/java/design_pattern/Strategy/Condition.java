package design_pattern.Strategy;

/**
 * Created  by liuqingjie on 2019/4/8 .
 */
public class Condition {
    public static final Operation add = new AddOperation();
    public static final Operation sub = new SubOperation();

    public static final Operation multi = new MultiOperation();

    public static final Operation div = new DivOperation();



}
