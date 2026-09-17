package test7;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-17
 * Time: 22:54
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = dog;

        if(animal instanceof Dog){
            dog = (Dog) animal;
            dog.bark();
        }
        if(animal instanceof Cat){
            cat = (Cat) animal;
            cat.bark();
        }
    }
}
