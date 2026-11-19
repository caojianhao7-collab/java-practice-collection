package test4;

interface Greeting {
    void greet();
}

public class Test {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public int age = 100;

            @Override
            public void greet() {
                System.out.println(this.age);
            }
        };

        greeting.greet();
    }
}
