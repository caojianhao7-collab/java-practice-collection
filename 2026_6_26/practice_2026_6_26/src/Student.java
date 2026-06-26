/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-26
 * Time: 22:57
 */
public class Student {

    public int age;
    public String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }
}
