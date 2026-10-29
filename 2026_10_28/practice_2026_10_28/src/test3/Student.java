package test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-10-29
 * Time: 12:04 AM
 */
public class Student implements Cloneable{
    public String name;
    public int age;
    public MoneyTest moneyTest = new MoneyTest(100);

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student tmp = (Student) super.clone();
        tmp.moneyTest = (MoneyTest) this.moneyTest.clone();
        return tmp;
    }


}
