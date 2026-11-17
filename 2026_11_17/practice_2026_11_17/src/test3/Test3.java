package test3;

public class Test3 {
    public int age;
    public static String classRoom;

    public static void demo1(String classRoom){
        System.out.println(Test3.classRoom);
        Test3.classRoom = classRoom;
        System.out.println(Test3.classRoom);
    }


    public static void main(String[] args) {
        Test3.demo1("233");
    }
}
