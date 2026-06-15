import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-14
 * Time: 22:51
 */
public class Test {

//    只出现一次的数字
//
//    给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
//    示例 1:
//    输入: [2,2,1]
//    输出: 1
//    示例 2:
//    输入: [4,1,2,1,2]
//    输出: 4

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
        int ret = retOnce(arr);
        System.out.println(ret);
    }

    public static int retOnce(int[] arr){
        for(int i = 0;i < arr.length;i++){
            boolean flag = true;
            for(int j = 0;j < arr.length;j++){
                if(i == j){
                    continue;
                }
                if(arr[i] == arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return arr[i];
            }
        }

        return -1;
    }

//    两数之和
//
//    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
//    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//    你可以按任意顺序返回答案。
//    示例 1：
//    输入：nums = [2,7,11,15], target = 9
//    输出：[0,1]
//    解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

    public static void main4(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arrRet = new int[2];
        int target = 8;
        boolean flag = false;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length;j++){
                if(i == j){
                    continue;
                }
                if(arr[i] + arr[j] == target){
                    arrRet[0] = i;
                    arrRet[1] = j;
                    flag = true;
                    break;
                }

            }
            if(flag){
                break;
            }
        }


        System.out.println(Arrays.toString(arrRet));
    }


//    冒泡排序
//
//    给定一个整型数组, 实现冒泡排序(升序排序)

    public static void main3(String[] args) {
        int[] arr = {2, 1, 3, 4, 5, 6, 7, 8, 9};
        int sz = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < sz; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false;
                }
            }
            sz--;
            if (flag) {
                break;
            }
        }


        System.out.println(Arrays.toString(arr));
    }

//    奇数位于偶数之前
//
//    调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
//
//    如数组：[1,2,3,4,5,6]
//
//    调整后可能是：[1, 5, 3, 4, 2, 6]

    public static void main2(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrRet = new int[arr.length];
        int left = 0;
        int right = arr.length-1;
        for (int i = 0;i < arr.length;i++){
            if(arr[i] % 2 != 0){
                arrRet[left] = arr[i];
                left++;
            }else{
                arrRet[right] = arr[i];
                right--;
            }
        }


        System.out.println(Arrays.toString(arrRet));
    }
//    改变原有数组元素的值
//
//    实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static void main1(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[]{1,2,3,4,5,};
        int[] arr3 = {1,2,3,4,5};

    }

    public static void transform(int[] arr){
        for(int i = 0;i < arr.length;i++){
            arr[i] = arr[i] * 2;
        }
    }

}
