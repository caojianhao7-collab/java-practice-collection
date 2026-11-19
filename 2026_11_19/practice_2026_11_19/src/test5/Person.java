package test5;

import java.util.Objects;

public class Person {
    public String name;
    public int age;


    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        Person other = (Person) obj;
        return this.age == other.age && Objects.equals(this.name, other.name);
    }
}
