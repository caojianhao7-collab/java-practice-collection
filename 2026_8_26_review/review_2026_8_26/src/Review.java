import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-08-26
 * Time: 10:21
 */
public class Review {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Arrays.fill(arr,0,11,-1);
        Arrays.fill(arr,2);
    }

    public static void main10(String[] args) {
        int[] arr1 = new int[2];
        int[] arr2 = new int[2];
        boolean flg = Arrays.equals(arr1,arr2);

    }

    public static void main9(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(arr));
        int[][] arr2 = new int[2][];
        arr2[0] = new int[3];
        arr2[1] = new int[5];
    }

    public static void main8(String[] args) {
        int[] arr = {4,2,6};
        Arrays.sort(arr);
    }

    public static void main7(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int ret = Arrays.binarySearch(arr,3);
        System.out.println(ret);
    }

    public static void main6(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = Arrays.copyOf(arr1,arr1.length*2);
        int[] arr3 = Arrays.copyOfRange(arr1,0,6);

    }

    public static int[] fun() {
        return new int[]{1, 2};
    }

    public static void main5(String[] args) {
        String fun = Arrays.toString(fun());
    }

    public static  void test(int[] arr) {
        arr = new int[]{100, 200, 300};
    }

    public static void main4(String[] args) {
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
