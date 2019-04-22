package design_pattern.builder;

/**
 * Created  by liuqingjie on 2019/4/8 .
 */
public interface PersonBuilder {
    void buidHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
