/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-10
 * Time: 23:42
 */
public class Student{
    private String name = "凯荣";
    private String gender;
    private int age;
    private double score;

    public Student() {
        System.out.println("I am Student init()!");
    }

    {
        this.name = "bit";
        this.age = 12;
        this.gender = "man";
        System.out.println("I am instance init()!");
    }

    public void show(){
        System.out.println("name: "+name+" age: "+age+" sex: 	"+gender);
    }
}
