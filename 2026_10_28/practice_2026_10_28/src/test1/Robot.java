package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-10-28
 * Time: 8:44 AM
 */
public class Robot implements IRunning{

    String name = "凯荣";

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在用机器腿跑");
    }
}
