package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-14
 * Time: 12:45
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Student.getClassRoom());
    }

    public static void main1(String[] args) {
//        System.out.println(Student.classRoom);
        Student student = new Student("凯荣250",18);
        System.out.println(student.getName());
    }
}
