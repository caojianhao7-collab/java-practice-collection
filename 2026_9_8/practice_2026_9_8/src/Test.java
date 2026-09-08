/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-08
 * Time: 17:00
 */
public class Test {


    public static void swap2(MyValue myVal1,MyValue myVal2) {
        int tmp = myVal1.val;
        myVal1.val = myVal2.val;
        myVal2.val = tmp;
    }

    public static void main1(String[] args) {
        MyValue myValue1 = new MyValue();
        myValue1.val = 10;
        MyValue myValue2 = new MyValue();
        myValue2.val = 20;
        swap2(myValue1,myValue2);
    }

}
