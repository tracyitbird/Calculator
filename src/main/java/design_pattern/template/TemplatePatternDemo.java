package design_pattern.template;

/**
 * Created  by liuqingjie on 2019/4/8 .
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Basketball();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
