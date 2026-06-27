/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-27
 * Time: 22:56
 */
public class Person {
    public int age = 18;
    public String name = "凯荣";

    public void sleep(){
        System.out.println("睡觉");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        this("凯荣");
        this.age = 18;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
