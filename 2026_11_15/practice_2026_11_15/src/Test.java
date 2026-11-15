import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
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
