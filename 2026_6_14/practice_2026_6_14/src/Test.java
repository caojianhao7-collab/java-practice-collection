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

//    奇数位于偶数之前
//
//    调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
//
//    如数组：[1,2,3,4,5,6]
//
//    调整后可能是：[1, 5, 3, 4, 2, 6]

    public static void main(String[] args) {
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
