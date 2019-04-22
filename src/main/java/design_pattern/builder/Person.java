package design_pattern.builder;

/**
 * Created  by liuqingjie on 2019/4/8 .
 *
 * 角色类，待构造的对象
 */
public class Person {

    private String head;

    private String body ;

    private String foot;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }
}
