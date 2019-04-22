package design_pattern.builder;

/**
 * Created  by liuqingjie on 2019/4/8 .
 */
public class ManBuilder implements  PersonBuilder {
    Person person ;
    public ManBuilder(){
        person = new man();
    }

    public void buidHead() {
        person.setHead("man  head");

    }

    public void buildBody() {
        person.setBody("man body");

    }

    public void buildFoot() {
        person.setFoot("man foot");

    }

    public Person buildPerson() {
        return person;
    }
}
