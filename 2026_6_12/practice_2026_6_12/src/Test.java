/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-12
 * Time: 23:07
 */
public class Test {

//    递归求解汉诺塔问题
//
//    递归求解汉诺塔问题

    public static void main(String[] args) {
        hanno(3,'A','B','C');
    }

    public static void hanno(int n,char pos1,char pos2,char pos3){
        if(n == 1){
            move(pos1,pos3);
            return;
        }
        hanno(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        hanno(n-1,pos2,pos1,pos3);
    }

    public static void move(char pos1,char pos3){
        System.out.println(pos1+"->"+pos3);
    }

//    递归求斐波那契数列的第 N 项
//
//    递归求斐波那契数列的第 N 项

    public static void main4(String[] args) {
        System.out.println(fiBo(5));
    }

    public static int fiBo(int N){
        if(N == 1 || N == 2){
            return 1;
        }
        return fiBo(N-2) + fiBo(N-1);
    }

//    返回的数字之和
//
//    写一个递归方法，输入一个非负整数，返回组成它的数字之和

    public static void main3(String[] args) {
        System.out.println(sumNum(1234));
    }

    public static int sumNum(int num){
        if(num < 10){
            return num;
        }
        return sumNum(num / 10) + (num % 10);
    }

//    递归打印数字的每一位
//
//    按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)    （递归）

    public static void main2(String[] args) {
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
