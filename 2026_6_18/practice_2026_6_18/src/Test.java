import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-18
 * Time: 19:39
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newArr));

        int[] newArr2 = new int[5];
        System.out.println("拷贝前："+Arrays.toString(newArr2));
        System.arraycopy(arr,0,newArr2,0,arr.length);
        System.out.println("拷贝后："+Arrays.toString(newArr2));
    }

    public static void main2(String[] args) {
        int[] arr = new int[10];
        Arrays.fill(arr,0,9,-1);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[10];
        Arrays.fill(arr2,-1);
        System.out.println(Arrays.toString(arr2));

    }


    public static void main1(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        boolean flag = Arrays.equals(arr1,arr2);
        System.out.println(flag);
    }

}
