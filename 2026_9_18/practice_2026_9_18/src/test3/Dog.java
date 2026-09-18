package test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-19
 * Time: 0:23
 */
public class Dog implements IEat {
    @Override
    public void eat() {
        System.out.println("重写的方法被调用");
    }
}
