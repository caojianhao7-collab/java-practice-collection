/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-06
 * Time: 23:49
 */
public class Test {
    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public static void main(String[] args) {
        int ret = 0;
        int i = 1;
        for (i = 1; i <= 100; i++) {
            while (i!=0) {
                if (i % 10 == 9) {
                    ret++;
                }
                i /= 10;
            }
        }


    }


}
