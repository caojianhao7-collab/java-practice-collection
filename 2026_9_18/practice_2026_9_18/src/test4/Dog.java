package test4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-19
 * Time: 0:35
 */
public class Dog extends Animal implements IRunning,ISwimming{

    public Dog(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(super.name+"在跑");
    }

    @Override
    public void swim() {
        System.out.println(super.name+"在游泳");
    }
}
