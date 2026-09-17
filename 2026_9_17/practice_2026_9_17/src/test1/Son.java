package test1;

import test2.Base;

import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-17
 * Time: 18:23
 */
public class Son extends Base {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.a);

//        C c = new C();
//        System.out.println(c.a);
    }
}

class C extends Base{
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.a);
    }
}
