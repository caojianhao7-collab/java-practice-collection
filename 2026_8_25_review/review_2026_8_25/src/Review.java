import java.util.Scanner;
import java.util.Random;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-08-25
 * Time: 16:50
 */
public class Review {

    public static void main(String[] args) {
        Random a = new Random();
        int num = a.nextInt(100);
        System.out.println(num);
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            sum += a;
        }
        System.out.println(sum);
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        float high = sc.nextFloat();
        
    }

}
