package test1;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        ScoreComparator scoreComparator = new ScoreComparator();
        int ret = scoreComparator.compare(student1,student2);

    }


}
