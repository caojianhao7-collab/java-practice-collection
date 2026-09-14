package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-14
 * Time: 20:31
 */
public class Student {
    private String name = "caocao";
    private int age;
    private static String classRoom = "233";

    public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("构造方法被执行");
    }

    public Student(){

    }

    static {
        System.out.println("静态代码块被执行");
        classRoom = "136";
    }

    {
        System.out.println("实例代码块被执行");
        this.name = "凯荣";
    }

    public static String getClassRoom() {
        return classRoom;
    }

    //    public String getClassRoom() {
//        return this.classRoom;
//    }

    public static void setClassRoom(String classRoom) {
        Student.classRoom = classRoom;
    }

    public static void testClassRoom(){
        Student stu = new Student();
        System.out.println(stu.age);
        System.out.println(stu.getName());
        System.out.println(Student.classRoom);
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
