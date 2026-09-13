package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-13
 * Time: 23:07
 */
public class Friend {
    public String name;
    public String gander;
    int age;

    public Friend(String name,String gander){
        this("cao");
        this.gander = gander;
    }

    public Friend(String name){
        this.name = name;
    }

    public void makeFriend(){
        System.out.println("交一个朋友");
    }
    public void play(){
        this.makeFriend();
        System.out.println("一起玩");
    }
}
