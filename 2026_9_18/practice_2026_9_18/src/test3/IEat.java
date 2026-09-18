package test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-19
 * Time: 0:22
 */
public interface IEat {
    default void eat(){
        System.out.println("接口方法被调用");
    }

}
