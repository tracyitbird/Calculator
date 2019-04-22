package design_pattern.singleton;

/**
 * Created  by liuqingjie on 2019/4/8 .
 */
public class SingletonDemo1 {
    private static final SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1(){};

    public static SingletonDemo1 getInstance(){
        return instance ;

    }





}
