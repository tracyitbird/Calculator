package design_pattern.builder;

/**
 * Created  by liuqingjie on 2019/4/8 .
 */
public class WomanBuilder implements  PersonBuilder {
    Person person ;
    public WomanBuilder(){
        person = new woman();
    }

    public void buidHead() {
        person.setHead("woman  head");

    }

    public void buildBody() {
        person.setBody("woman body");

    }

    public void buildFoot() {
        person.setFoot("woman foot");

    }

    public Person buildPerson() {
        return person;
    }
}
