/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-11
 * Time: 23:33
 */
public class Rect extends Shape {
    private double length;
    private double width;

    Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("矩形 ");
    }
}

//public abstract class Shape {
//    abstract final void methodA();
//    abstract public static void methodB();
//}
