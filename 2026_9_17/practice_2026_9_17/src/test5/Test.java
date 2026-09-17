package test5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-09-17
 * Time: 18:55
 */
public class Test {

    public static void main5(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.eat();
        animal2.eat();
    }

    public static void main4(String[] args) {
        Animal animal = new Dog();
//        animal.bark();
    }



    public static Animal fun(){
        return new Dog();
    }

    public static void main3(String[] args) {
        Animal animal = fun();
    }


    public static void eat(Animal animal){
        animal.eat();
    }

    public static void main2(String[] args) {
        Animal animal = new Dog();
        eat(animal);
    }

    public static void main1(String[] args) {
        Animal animal = new Dog();

    }
}
