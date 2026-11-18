package test8;

public class Animal {
    String name;

    public Animal feed(){
        System.out.println(this.name+"吃饭");
        return null;
    }

    public void test(){
        System.out.println("父类test方法被调用");
    }

}
