package design_pattern.template;

/**
 * Created  by liuqingjie on 2019/4/8 .
 */
public class Football extends Game {

    void endPlay() {
        System.out.println("Football Game Finished!");
    }


    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }


    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
