package test5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-10-29
 * Time: 10:09 AM
 */
public class Test {

    public static void main(String[] args) {
        Student.SInsideClass sInsideClass = new Student.SInsideClass();

        Student.SInsideClass.methodSInside();
    }


    public static void main1(String[] args) {
        Student student = new Student();
        Student.InsideClass insideClass = student.new InsideClass();
        System.out.println(insideClass.a);

        new Student().testIn();


    }
}
