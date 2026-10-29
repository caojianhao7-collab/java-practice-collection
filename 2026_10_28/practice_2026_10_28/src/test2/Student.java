package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-10-28
 * Time: 9:22 AM
 */
public class Student implements Comparable<Student>{
    public String name;
    public  int age;
    public int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.score > o.score){
            return 1;
        }else if (this.score < o.score){
            return -1;
        }else{
            return 0;
        }
    }



}
