/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-09
 * Time: 23:37
 */
public class Person{

    private String name = "Person";

    int age=0;

}

public class Child extends Person{

    public String grade;

    public static void main1(String[] args){

        Person p = new Child();

        System.out.println(p.name);

    }

}
