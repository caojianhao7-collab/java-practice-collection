/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-01
 * Time: 17:56
 */
public class Practice {
    public static void main(String[] args) {
        int a=10;
        long b=20000000000000000L;
        a+=b;
        System.out.println(a);
        int c=10;
        double d=10.5;
        c+=d;
        System.out.println(c);
    }

    public static void main10(String[] args) {
        double b=11.5%2;
        System.out.println(b);
    }

    public static void main9(String[] args) {
        String str1=String.valueOf(100);
        int num=Integer.parseInt(str1);
        System.out.println(num+1);
    }

    public static void main8(String[] args) {
        int num=10;
        String s1=String.valueOf(num);
        String s2=num+" ";
        System.out.println(s2+1);
    }

    public static void main7(String[] args) {
        String s1="hello";
        String s2="world";
        System.out.println(s1+s2+10+10);
        System.out.println(s1+" "+s2+(10+10));

    }

    public static void main6(String[] args) {
        byte a=10;
        byte b=10;
        byte c=(byte) (a+b);
    }

    public static void main5(String[] args) {
        byte a=100;
        byte b=(byte) 200;
        int num1=10;
        long num2=20L;
        num1=(int)num2;

        int c=10;
        long d=c;

    }

    public static void main4(String[] args) {
        char c1='a';
        char c2='凯';
        System.out.println(c2);
    }

    public static void main3(String[] args) {
        double mum=1.1;
        System.out.println(mum*mum);
        float a=10.5f;

    }

    public static void main2(String[] args) {
        long a=10L;
        System.out.println(10L);
        short b=5;
        byte c=20;
    }

    public static void main1(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
