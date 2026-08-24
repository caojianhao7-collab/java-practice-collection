/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-08-24
 * Time: 22:52
 */
public class Review {

    public static void main(String[] args) {
        String a = "100";
        int num = Integer.parseInt(a);
    }

    public static void main5(String[] args) {
        int num = 10;
        String a = num+"";
        String b = String.valueOf(num);
        String c = String.valueOf(3.14);

    }

    public static void main4(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println("a+b="+(a+b));
    }

    public static void main3(String[] args) {
        byte a = 10;
        byte b = 20;
        int c = a+b;

    }

    public static void main2(String[] args) {
        char a = 'a';
        char b = '曹';
        boolean c = true;
        System.out.println(c);

    }

    public static void main1(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        long a = 0L;
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        short b = 3;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        byte c = 127;
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        float d = 2.3f;
    }

}
