package test2;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-10-28
 * Time: 9:17 AM
 */
public class Test {

    public static void main(String[] args) {
        Student[] students = {new Student("aa",18,90),new Student("cc",19,98)};
        Arrays.sort(students);
    }



    public static int compareStudent(Student s1,Student s2,Comparator comparator){
        return comparator.compare(s1,s2);
    }

    public static void main2(String[] args) {
        Student s1 = new Student("aa",18,90);
        Student s2 = new Student("cc",19,98);
        ScoreComparator scoreComparator = new ScoreComparator();
        compareStudent(s1,s2,scoreComparator);
    }


    public static void main1(String[] args) {
        Student s1 = new Student("aa",18,90);
        Student s2 = new Student("cc",19,98);
        System.out.println(s1.compareTo(s2));
    }



}
