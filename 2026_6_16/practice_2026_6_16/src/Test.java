/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-16
 * Time: 23:03
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        String ret = myToString(arr);
        System.out.println(ret);
    }

    public static String myToString(int[] arr) {
        String ret = "[";

        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if(i != arr.length-1){
                ret += ",";
            }
        }

        ret += "]";

        return ret;
    }
}
