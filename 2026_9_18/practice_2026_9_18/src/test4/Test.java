package test4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-19
 * Time: 0:32
 */
public class Test {

    public static void run(IRunning iRunning){
        iRunning.run();
    }

    public static void main(String[] args) {
        run(new Dog("凯荣"));
    }


    public static void main1(String[] args) {


//        IRunning iRunning = new Dog("凯荣");
//        iRunning.run();
    }
}
