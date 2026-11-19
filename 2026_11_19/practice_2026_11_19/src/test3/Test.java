package test3;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner2 inner2 = new Outer.Inner2();
        inner2.show(outer);
        Outer.Inner1 inner1 = outer.new Inner1();
        inner1.show();
    }
}
