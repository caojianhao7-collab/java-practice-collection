/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-07-04
 * Time: 23:42
 */
import java.util.Scanner;
//修改Data类的定义
//
//        描述
//        现有一个Data类，内部定义了属性x和y，在main方法中实例化了Data类，并计算了data对象中x和y的和。但是，Data类的定义存在错误，
//        请你将这些错误修正过来，使得main方法中的求和逻辑可以正常执行。
//
//        输入描述：
//        两个整数
//
//        输出描述：
//        两个整数的和
//
//        示例1
//        输入：
//        1 2
//        复制
//
//        输出：
//        3
//
//        代码如下：

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Data data = new Data(x, y);
            System.out.println(data.getX() + data.getY());
        }
    }

}

class Data {

    public int x;
    public int y;

    public Data(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

}