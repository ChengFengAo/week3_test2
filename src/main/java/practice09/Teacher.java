package practice09;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        String result="";
        if (this.getKlass() == null) {
            result = super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            result=super.introduce()+" I am a Teacher. I teach Class "+this.getKlass().getNumber()+".";
        }
        return result;
    }
    public String introduceWith(Student student) {
        String result="";
        if (this.getKlass().getNumber() == student.getKlass().getNumber()) {
            result = super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            result=super.introduce()+" I am a Teacher. I don't teach "+ student.getName() + ".";
        }
        return result;
    }

}
