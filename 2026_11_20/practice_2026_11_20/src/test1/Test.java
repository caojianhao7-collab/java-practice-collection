package test1;

import java.util.Locale;

public class Test {

    public static void main(String[] args) {
        
    }


    public static void main2(String[] args) {
        String s = "caocao";
        String old = s;
        s = s + "haohao";
        old = s.toUpperCase();
        //System.out.println(s == old);
    }

    public static void main1(String[] args) {
        String s = new String("cacao");
        System.out.println(s.length());
        System.out.println(s.charAt(0));
    }
}
