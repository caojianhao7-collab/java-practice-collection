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

    //测试提交

//    递归求解汉诺塔问题
//
//    递归求解汉诺塔问题

    public static void main(String[] args) {
        hanNio(5,'A','B','C');
    }

    public static void hanNio(int n,char a,char b,char c){
        if(n == 1){
            move(a,c);
            return;
        }
        hanNio(n-1,a,c,b);
        move(a,c);
        hanNio(n-1,b,a,c);
    }

    public static void move(char pos1,char pos2){
        System.out.println(pos1+"->"+pos2);
    }

//    递归求和
//
//    递归求 1 + 2 + 3 + ... + 10

    public static void main9(String[] args) {
        System.out.println(sum(10));
    }

    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n+sum(n-1);
    }


//    二分查找
//
//    给定一个有序整型数组, 实现二分查找

    public static void main8(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int search = 8;
        int ret = searchInt(arr,search);
        System.out.println(ret);
    }

    public static int searchInt(int[] arr,int search){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int middle = (left + right) / 2;
            if(arr[middle] == search){
                return middle;
            } else if (arr[middle] > search) {
                right = middle - 1;
            } else if (arr[middle] < search) {
                left = middle + 1;
            }

        }

        return -1;
    }

//    存在连续三个奇数的数组
//
//    给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
//
//    示例 1：
//    输入：arr = [2,6,4,1]
//    输出：false
//    解释：不存在连续三个元素都是奇数的情况。
//    示例 2：
//    输入：arr = [1,2,34,3,4,5,7,23,12]
//    输出：true
//    解释：存在连续三个元素都是奇数的情况，即 [5,7,23] 。

    public static void main7(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        boolean flag = threeJi(arr);
        System.out.println(flag);
    }

    public static boolean threeJi(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true;
            }
        }


        return false;
    }

//    多数元素
//
//    给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
//
//
//    你可以假设数组是非空的，并且给定的数组总是存在多数元素。
//
//
//    示例 1：
//    输入：[3,2,3]
//    输出：3
//    示例 2：
//    输入：[2,2,1,1,1,2,2]
//    输出：2

    public static void main6(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        moreNum(arr,arr.length);
    }

    public static void moreNum(int[] arr,int n){
        for(int i = 0;i < n;i++){
            int count = 0;
            for(int j = 0;j < n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > (n / 2)){
                System.out.println(arr[i]);
                return;
            }
        }
    }

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

    public static void main5(String[] args) {
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
