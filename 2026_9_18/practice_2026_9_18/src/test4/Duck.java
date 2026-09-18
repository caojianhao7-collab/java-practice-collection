package test4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-19
 * Time: 1:04
 */
public class Duck extends Animal implements ISwimming,IFlying,IRunning{

    public Duck(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(super.name+"在飞");
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
