/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-04
 * Time: 23:56
 */
public class Derived extends Base{
    public Derived(){
        super(10);//此时通过super(参数)的形式
        System.out.println("Derived()");
    }
}
