package test4;

public class Test {

    public static void run(IRunning iRunning){
        iRunning.run();
    }

    public static void main(String[] args) {
        run(new Dog("凯荣"));
    }
;;}
