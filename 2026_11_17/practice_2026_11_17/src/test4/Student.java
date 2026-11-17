package test4;


public class Student {
    public String name = "凯荣";
    public int age = 18;
    public static String classRoom;

    {
        System.out.println("实例代码块");
        this.name = "cc";
        this.age = 19;
    }

    static {
        System.out.println("静态代码块");
        Student.classRoom = "233";
    }

    public Student(){
        System.out.println("构造代码块");
    }
}
