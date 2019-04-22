package design_pattern.builder;

/**
 * Created  by liuqingjie on 2019/4/8 .
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder pb){
        pb.buidHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }

}
