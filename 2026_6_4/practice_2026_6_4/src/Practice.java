/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-04
 * Time: 22:13
 */
public class Practice {

    public static void main(String[] args) {
        int a = 29;
        int b = 20;
        double c = 3.14;
        double max = a > b? a : c;
        System.out.println(max);
        System.out.println(a<<1);
        System.out.println(a>>1);
    }

    public static void main2(String[] args) {
        System.out.println(10 > 5 & 2<10);
        int a = 10;
        System.out.println(10 > 5 && a / 0 == 0);

    }

    public static void main1(String[] args) {
        String str1="haha";
        switch(str1){
            case "hehe":
                System.out.println("hehe");
                break;
            case "haha":
                System.out.println("haha");
                break;
        }
    }
}
