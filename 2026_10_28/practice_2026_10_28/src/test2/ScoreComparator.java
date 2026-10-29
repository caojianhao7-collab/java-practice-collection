package test2;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-10-28
 * Time: 11:37 PM
 */
public class ScoreComparator implements Comparator <Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.score - o2.score;
    }
}
