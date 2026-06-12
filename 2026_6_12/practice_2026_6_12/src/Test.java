/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-12
 * Time: 23:07
 */
public class Test {

//    递归打印数字的每一位
//
//    按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)    （递归）

    public static void main(String[] args) {
        print(1234);
    }

    public static void print(int num){
        if(num >= 10){
            print(num / 10);
        }
        System.out.println(num%10);
    }

//    递归求 N 的阶乘
//
//    递归求 N 的阶乘
    public static void main1(String[] args) {
        System.out.println(jieCheng(5));
    }

    public static int jieCheng(int num){
        if(num == 1){
            return 1;
        }
        return num*jieCheng(num - 1);
    }
}
