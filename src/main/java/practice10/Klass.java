package practice10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;
public class Klass {
    private int number;
    private List<Student> members=new ArrayList<>();
    private Student leader;
    public Klass(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public String getDisplayName() {
     return "Class "+getNumber();
    }
    public void assignLeader(Student student) {
        if(members.contains(student)!=true)
        {
            System.out.print("It is not one of us.\n");
        }
        else {
            leader = student;
        }
    }
    public Student getLeader() {
     return leader;
    }

    public void appendMember(Student student) {
        members.add(student);
    }

    public static Boolean isIn( Student student, Set<Klass> classes) {
        Boolean result;
        if (classes.contains(student.getKlass())) {
         result=true;
        }
        else {
            result=false;
        }
        return result;
    }
}
