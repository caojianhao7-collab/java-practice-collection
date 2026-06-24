import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-24
 * Time: 23:32
 */
public class Test {



//    奇数位于偶数之前
//
//    调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
//
//    如数组：[1,2,3,4,5,6]
//
//    调整后可能是：[1, 5, 3, 4, 2, 6]

    public static void exchange(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            while (arr[left] % 2 != 0 && left < right){
                left++;
            }
            while(arr[right] % 2 == 0 && left < right){
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        exchange(arr);
        System.out.println(Arrays.toString(arr));
    }

}
