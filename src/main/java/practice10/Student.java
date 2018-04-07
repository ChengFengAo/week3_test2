package practice10;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        String result = "";
        if (this.getKlass().getLeader() == null) {
            result = super.introduce() + " I am a Student. I am at Class " + this.getKlass().getNumber() + ".";
        } else {
            result=super.introduce()+" I am a Student. I am Leader of Class "+this.getKlass().getNumber()+".";
        }
        return result;
    }
}
