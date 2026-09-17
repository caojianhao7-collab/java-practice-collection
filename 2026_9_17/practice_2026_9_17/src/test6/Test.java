package test6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-17
 * Time: 22:37
 */
public class Test {
    public static void main(String[] args) {
        Shape[] shape = {new Flower(),new Cycle()};
        for (int i = 0; i < 2; i++) {
            shape[i].draw();
        }
    }
}
