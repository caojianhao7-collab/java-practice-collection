package test1;

public class Test {
    public Animal Ret(int a){
        if(a > 0){
            return new Dog();
        }
        return new Animal();
    }


    public static void main(String[] args) {
        Animal animal = new Dog();
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.bark();
        }

    }
}
