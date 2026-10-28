package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-10-28
 * Time: 7:54 AM
 */
public class Test {

    public static void funcRun(IRunning iRunning){
        iRunning.run();
    }

    public static void main(String[] args) {
        funcRun(new Robot("凯荣"));
        funcRun(new Flog("凯荣"));

    }
}
