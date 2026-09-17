package test5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-17
 * Time: 19:10
 */
public class Animal {
    public String name;
    public int age;

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(this.name+"在吃饭");
    }
}
