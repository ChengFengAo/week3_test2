package practice07;

public class Student extends Person {

     Klass klass;
    public Student(String name, int age, Klass kc) {
        super(name, age);
         klass = kc;
    }

    public Klass getKlass()
    {
        return klass;
    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + this.getKlass().getNumber() + ".";
    }
}
