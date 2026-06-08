/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-08
 * Time: 22:49
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt(); // 在这里输入数字
            int left = 1;
            int right = num;
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num; j++) {
                    if (j == left || j == right) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");

                left++;
                right--;
            }
        }

    }
}
