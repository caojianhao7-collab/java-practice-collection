package test2;

public class Student implements Cloneable{
    public String name;
    public int age;
    public Money money = new Money();

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student ret = (Student) super.clone();
        ret.money = ret.money.clone();
        return ret;
    }
}
