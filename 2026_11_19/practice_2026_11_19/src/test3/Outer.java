package test3;

public class Outer {
    public int age;
    public static int value;


    class Inner1 {
        public int age;
        public static int value;

        public void show(){
            System.out.println(value);
            System.out.println(Outer.value);
            System.out.println(Outer.this.age);
        }

    }


    static class Inner2{
        public int age;
        public static int value;

        public void show(Outer outer){
            System.out.println(Outer.value);
            System.out.println(outer.age);
        }
    }


}
