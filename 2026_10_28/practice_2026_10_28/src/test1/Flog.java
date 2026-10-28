package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-10-28
 * Time: 8:43 AM
 */
public class Flog extends Animal implements IRunning,ISwimming{
    public Flog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(super.getName()+"正在跳");
    }

    @Override
    public void swim() {
        System.out.println(super.getName()+"正在游泳");
    }



}
