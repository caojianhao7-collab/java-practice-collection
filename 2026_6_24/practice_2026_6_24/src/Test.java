import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-24
 * Time: 23:32
 */
public class Test {

//    多数元素
//
//    给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
//
//    你可以假设数组是非空的，并且给定的数组总是存在多数元素。
//
//
//
//    示例 1：
//    输入：[3,2,3]
//    输出：3
//
//    示例 2：
//    输入：[2,2,1,1,1,2,2]
//    输出：2

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        Arrays.sort(arr);
        System.out.println(arr[arr.length / 2]);
    }

//    只出现一次的数字
//
//    给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
//
//    示例 1:
//    输入: [2,2,1]
//    输出: 1
//
//    示例 2:
//    输入: [4,1,2,1,2]
//    输出: 4

    public static void main2(String[] args) {
        int[] arr = {2,2,1};
        int ret = numOnce(arr);
        System.out.println(ret);
    }

    public static int numOnce(int[] arr){
        int ret = 0;
        for(int i = 0;i < arr.length;i++){
            ret ^= arr[i];
        }
        return ret;
    }



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

    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        exchange(arr);
        System.out.println(Arrays.toString(arr));
    }

}
