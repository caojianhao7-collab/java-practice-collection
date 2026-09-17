package test5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-17
 * Time: 19:10
 */
public class Dog extends Animal{

    @Override
    public Dog eat() {
        System.out.println(super.name+"在吃狗粮");
        return null;
    }
}
