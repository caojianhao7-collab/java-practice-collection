package test5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-10-29
 * Time: 10:14 AM
 */
public class Student {
    public int a = 10;
    public int b;
    public static int c;


    class InsideClass{
        public int a;
        public int b;
        public int c = Student.this.b;

        public void methodInside(){
            System.out.println(Student.this.a);
            System.out.println(this.a);
        }
    }

    static class SInsideClass{
        public static void methodSInside(){
            System.out.println(Student.c);
            Student student = new Student();
            System.out.println(student.a);
        }
    }


    public void testIn(){
        InsideClass insideClass = new InsideClass();
    }

}
