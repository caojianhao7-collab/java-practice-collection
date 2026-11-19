package test5;

public class Student implements Comparable<Student>{
    public String name;
    public int score;

    @Override
    public int compareTo(Student o) {
        if(this.score > o.score){
            return 1;
        } else if (this.score < o.score) {
            return -1;
        } else {
            return 0;
        }

    }
}
