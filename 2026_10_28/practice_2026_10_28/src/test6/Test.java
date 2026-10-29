package test6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-10-29
 * Time: 11:12 AM
 */

public class Test {


    public static void main8(String[] args) {
        String s = "hello cc hello world";
        String[] ret = s.split(" | +",2);

    }

    public static void main7(String[] args) {
        String s1 = "hello";
        String ret = s1.replace("ll","cc");
    }

    public static void main6(String[] args) {
        String s1 = "hello";
        char[] arr = s1.toCharArray();
    }

    public static void main5(String[] args) {
        String s1 = "hello";
        String ret = s1.toUpperCase();
    }

    public static void main4(String[] args) {
        String s1 = String.valueOf(new Student("aa",18));
        String s2 = String.valueOf(123);
        System.out.println(s1);

        int data1 = Integer.parseInt("123");
    }



    public static void main3(String[] args) {
        String s = "abcccdefff";
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf('d'));
        System.out.println(s.indexOf('c',2));
        System.out.println(s.indexOf("fff"));
        System.out.println(s.indexOf("fff",3));
        System.out.println(s.lastIndexOf('c'));
        System.out.println(s.lastIndexOf('c',6));

    }


    public static void main2(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("He");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
    }

    public static void main1(String[] args) {
        String s1 = new String("hello");
        char[] chars = {'a', 'b', 'c'};
        String s2 = new String(chars);
        System.out.println(s2);
    }
}

