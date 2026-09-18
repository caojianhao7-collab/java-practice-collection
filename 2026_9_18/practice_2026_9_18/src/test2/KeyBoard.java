package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-18
 * Time: 22:45
 */
public class KeyBoard implements IUsb{
    @Override
    public void openDevice() {
        System.out.println("打开键盘");
    }

    public void write(){
        System.out.println("打字");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭键盘");

    }
}
