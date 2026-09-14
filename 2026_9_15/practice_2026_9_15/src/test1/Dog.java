package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-15
 * Time: 3:14
 */
public class Dog extends Animal{
    public int a;

    public void bark(){
        System.out.println(super.name+"在狗叫");
        System.out.println(this.a);
    }

    public void test(int a){
        System.out.println("有参");
    }

//    public static void test2(){
//        System.out.println(super.name);
//    }
}
