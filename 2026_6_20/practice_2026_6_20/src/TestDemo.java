/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-20
 * Time: 23:16
 */
public class TestDemo{

    private int count;

    public static void main(String[] args) {

        TestDemo test=new TestDemo(88);

        System.out.println(test.count);

    }

    TestDemo(int a) {

        count=a;

    }

}