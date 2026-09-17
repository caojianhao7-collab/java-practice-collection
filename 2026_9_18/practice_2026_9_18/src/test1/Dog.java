package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-18
 * Time: 1:18
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println(super.name+"吃狗粮");
    }
}
