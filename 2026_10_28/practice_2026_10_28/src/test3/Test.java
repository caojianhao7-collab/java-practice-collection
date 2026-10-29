package test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-10-29
 * Time: 12:04 AM
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student("aa",18);
        Student s2 = (Student) s1.clone();

        s2.moneyTest.money = 200;
        System.out.println(s1.moneyTest.money);
    }

    public static void main1(String[] args) throws CloneNotSupportedException{
//        Student s1 = new Student("aa",18);
//        Student s2 = (Student) s1.clone();
    }
}
