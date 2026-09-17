package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-16
 * Time: 12:57
 */
public class Test {

    public  static void swap(Num num1,Num num2){
        int tmp = num1.num;
        num1.num = num2.num;
        num2.num = tmp;
    }

    public static void main(String[] args) {
        Num num1 = new Num();
        num1.num = 10;
        Num num2 = new Num();
        num2.num = 20;
        swap(num1,num2);
        System.out.println(num1.num+" "+ num2.num);
    }
}
