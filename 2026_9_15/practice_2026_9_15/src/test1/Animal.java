package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-15
 * Time: 3:14
 */
public class Animal {
    public int a;
    public String name;
    public int age;

    public void test(){
        System.out.println("无参");
    }

    public void eat(){
        System.out.println(this.name+"在吃饭");
    }
}
