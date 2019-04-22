package design_pattern.facade;

/**
 * Created  by liuqingjie on 2019/4/8 .
 */
public class StudentService {
    studentDao stdao1 = new StudentDaoIml1();
    StudentDao2 studentDao2 = new StudentDaoImpl2();

    public void printout(){
        System.out.println(stdao1.getStudentName()+","+studentDao2.getStudentCode());
    }


}
