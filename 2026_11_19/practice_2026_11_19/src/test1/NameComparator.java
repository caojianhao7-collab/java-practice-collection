package test1;

import java.util.Comparator;

public class NameComparator implements Comparator <Student>{
    @Override
    public int compare(Student o1, Student o2) {
        //return o1.score - o2.score;
        return Integer.compare(o1.score, o2.score);
    }
}
