package practice11;

import java.util.*;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private HashSet<Klass> kl= new HashSet<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }
    public Teacher(int id, String name, int age, HashSet<Klass> kl) {
        super(id, name, age);
         this.kl.addAll(kl);
    }

    public HashSet<Klass> getClasses() {
       return this.kl;
    }
    public String introduce() {
        String result="";
        List<Integer> contain= new ArrayList<>();
        String classes="";
        if (this.getClasses().size() == 0) {
            result=super.introduce()+" I am a Teacher. I teach No Class.";
        }
        else
            {
                Iterator<Klass> c= this.getClasses().iterator();
                while (c.hasNext()) {
                    contain.add(c.next().getNumber());
                }
                List<Integer> tmp=contain.stream().sorted().collect(Collectors.toList());
                for (int i = 0; i <tmp.size() ; i++) {
                    classes += tmp.get(i)+","+" ";
                }
                result=super.introduce()+" I am a Teacher. I teach Class "+classes.substring(0,classes.length()-2)+".";
            }
        return result;
    }

    public Boolean isTeaching(Student student) {
       return Klass.isIn(student,this.getClasses());
    }

    public String introduceWith(Student student) {
        String result;
        if (this.getClasses().contains(student.getKlass())) {
            result=super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }
        else {
            result=super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }
        return result;
    }

    public static void print_member( Student student,Klass klass) {
        System.out.print("I am Tom. I know "+student.getName()+" has joined Class "+klass.getNumber()+".\n");
    }

    public static void print_leader(Student student,Klass klass) {
        System.out.print("I am Tom. I know "+student.getName()+" become Leader of Class "+klass.getNumber()+".\n");

    }
}
