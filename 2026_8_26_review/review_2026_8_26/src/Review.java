import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-08-26
 * Time: 10:21
 */
public class Review {

    public static  void test(int[] arr) {
        arr = new int[]{100, 200, 300};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        test(arr);
        System.out.println(arr[0]);
    }

    public static void main3(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4;
        arr4 = new int[]{1, 2, 3};
        System.out.println(arr2.length);
        System.out.println(Arrays.toString(arr3));
        int[] arr5 = null;
    }

    public static void main2(String[] args) {
        String name = "caocao";
        if (name.equals("caocao")) {
            System.out.println(1);
        }
        int a = 10;
        System.out.println(a);
    }

    public static void main1(String[] args) {
        int ret = add(1,2);
    }

    public static int add(int a,int b){
        return a+b;
    }

    public static double add(double a,double b){
        return a+b;
    }

}
