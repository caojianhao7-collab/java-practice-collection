package test4;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-10-29
 * Time: 12:54 AM
 */
public class Student {
    public String name;
    public int age;

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        if(!(obj instanceof Student)){
            return false;
        }


        Student s2 = (Student) obj;
        if(this.age == s2.age && this.name.equals(s2.name)){
            return true;
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.age,this.name);
    }
}
