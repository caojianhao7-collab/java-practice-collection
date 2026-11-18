package test1;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    public void bark(){
        System.out.println("汪汪叫");
    }
}
