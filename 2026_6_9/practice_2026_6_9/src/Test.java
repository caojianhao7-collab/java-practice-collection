import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-09
 * Time: 22:48
 */
public class Test {

//    输出一个整数的每一位
//
//    输出一个整数的每一位，如：123的每一位是3，2，1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num != 0){
            System.out.println(num%10+'\n');
            num/=10;
        }

    }
}
