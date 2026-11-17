package test2;

public class Test2 {
    private int age;
    String name;
    private String id;

    public String getId(){
        return this.id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.out.println("输入的年龄错误，无法修改");
            return;
        }
        this.age = age;
    }
}
