package practice11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> member=new ArrayList<>();
    public Klass(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public void assignLeader(Student student) {
        if (member.contains(student)!=true) {
            System.out.print("It is not one of us.\n");
        }
        else {
          Teacher.print_leader(student,this);
            leader=student;
        }
    }
    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return "Class "+this.getNumber();
    }

    public void appendMember(Student student) {
        member.add(student);
        Teacher.print_member(student,this);
    }

    public static Boolean isIn(Student student, HashSet<Klass> teacher) {
        Boolean result;
        if (teacher.contains(student.getKlass())) {
            result=true;
        }
        else {
            result=false;
        }
        return result;
    }
}
