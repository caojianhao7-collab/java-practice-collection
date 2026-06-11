/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-11
 * Time: 23:47
 */
public class Test {

//    递归求和
//
//    递归求 1 + 2 + 3 + ... + 10
    public static void main(String[] args) {
        int num = 10;
        int ret = sumAdd(num);
        System.out.println(ret);
    }

    public static int sumAdd(int num){
        if(num == 1){
            return 1;
        }
        return num + sumAdd(num - 1);
    }

}
