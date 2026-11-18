package test2;

public class B extends A{
    public int a = 1;

    @Override
    public void test() {
        System.out.println("子类的test,a = "+this.a);
    }

    public B() {
        super();
    }
}
