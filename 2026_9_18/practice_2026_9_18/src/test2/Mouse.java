package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-18
 * Time: 22:43
 */
public class Mouse implements IUsb{

    @Override
    public void openDevice() {
        System.out.println("打开鼠标");
    }

    public void useMouse(){
        System.out.println("点击鼠标");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标");
    }
}
