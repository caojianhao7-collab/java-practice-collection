import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = Arrays.copyOf(arr,arr.length);
    }

    public static int[] fib(int n) {
        if (n <= 0) {
            return null;
        }
        int[] arr = new int[n];
        arr[0] = 1;
        if (n >= 2) {
            arr[1] = 1;
        }

        for (int i = 3; i <= n; i++) {
            arr[i-1] = arr[i - 2] + arr[i - 3];
        }
        return arr;
    }

    public static void main6(String[] args) {
        int[] ret = fib(6);
        System.out.println(Arrays.toString(ret));
    }

    public static void main5(String[] args) {
        int[] arr = new int[0];
    }

    public static void main4(String[] args) {
        int[] arr = {1,2,3};
        for(int x : arr){
            System.out.println(x);
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main3(String[] args) {
        int a = 20;
        int num = 10;
        System.out.println(num);
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            System.out.println(num);
        }
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println(age);
        System.out.println(name);

    }
}
