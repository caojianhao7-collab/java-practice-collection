import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-10
 * Time: 11:42
 */
public class Test {
//    斐波那契数列
//
//    求斐波那契数列的第n项。(迭代实现)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        if(n == 2){
            c = 1;
        }
        System.out.println(c);

    }


//    求最大值方法的重载
//
//    在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值？

    public static void main3(String[] args) {
        int a = 5;
        int b = 2;
        int c = 3;
        System.out.println(max(c,b));
        System.out.println(max(a,b,c));
    }
    public static int max(int x,int y){
        return x>y?x:y;
    }

    public static int max(int x,int y,int z){
        int tmp = x>y?x:y;
        return tmp>z?tmp:z;
    }

//    求阶乘和
//
//    求1！+2！+3！+4！+........+n!的和

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += jieCheng(i);
        }
        System.out.println(sum);
    }

    public static int jieCheng(int n){
        int sum = 1;
        while(n!=0){
            sum *= n;
            n--;
        }
        return sum;
    }

//    模拟登陆
//
//    编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
    public static void main1(String[] args) {
        int relNum = 1314;
        Scanner sc = new Scanner(System.in);
        int count = 3;
        while(count!=0){
            int num = sc.nextInt();
            if(num == relNum){
                System.out.println("登录成功");
                return;
            }
            System.out.println("输入错误，再输一次");
            count--;
        }
        System.out.println("退出程序");
    }
}
