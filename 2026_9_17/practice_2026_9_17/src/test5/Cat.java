package test5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-17
 * Time: 22:20
 */
public class Cat extends Animal{
    public Cat(){
        super("凯荣",18);
    }

    @Override
    public void eat() {
        System.out.println(super.name+"在吃鱼");
    }
}
