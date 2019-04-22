package design_pattern.singleton;

/**
 * Created  by liuqingjie on 2019/4/8 .
 */
public class SingletonDemo2 {
    private static SingletonDemo2 instance = null;

    public static  synchronized  SingletonDemo2 getInstance(){
        if(instance ==null){
            instance = new SingletonDemo2();
        }

        return  instance;


    }


}
