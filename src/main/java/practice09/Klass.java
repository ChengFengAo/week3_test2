package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> members = new ArrayList<>();
    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }

    public void assignLeader(Student student) {
        if (members.contains(student)!=true) {
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
}
