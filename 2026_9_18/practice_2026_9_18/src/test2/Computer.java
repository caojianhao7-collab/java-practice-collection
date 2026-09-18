package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-18
 * Time: 22:48
 */
public class Computer {
    public void openComputer(){
        System.out.println("打开电脑");
    }

    public void useDevice(IUsb iusb){
        iusb.openDevice();
        if(iusb instanceof Mouse){
            Mouse mouse = (Mouse) iusb;
            mouse.useMouse();
        }else if (iusb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard) iusb;
            keyBoard.write();
        }
        iusb.closeDevice();
    }

    public void closeComputer(){
        System.out.println("关闭电脑");
    }
}
