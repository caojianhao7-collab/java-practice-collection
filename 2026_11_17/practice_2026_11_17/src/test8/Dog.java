package test8;

public class Dog extends Animal{
    @Override
    public Dog feed() {
        System.out.println(super.name+"吃骨头");
        return null;
    }
}
