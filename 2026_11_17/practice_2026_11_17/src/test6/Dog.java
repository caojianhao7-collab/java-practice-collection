package test6;

import test5.Animal;

public class Dog extends Animal {
    public int age;

    public void test(){
        System.out.println(super.age);
        Cat cat = new Cat();
        //System.out.println(cat.age);
    }
}
