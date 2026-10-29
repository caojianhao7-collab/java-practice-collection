package test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-10-29
 * Time: 12:13 AM
 */
public class MoneyTest implements Cloneable{
    public int money;

    public MoneyTest(int money) {
        this.money = money;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
