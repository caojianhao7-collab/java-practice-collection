import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-10
 * Time: 11:42
 */
public class Test {
//    求阶乘和
//
//    求1！+2！+3！+4！+........+n!的和

    public static void main(String[] args) {
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
