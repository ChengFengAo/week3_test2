package practice04;

public class Student extends Person {
    int klass;
    Student(String name,int age,int klass) {
        super(name,age);
        this.klass=klass;
    }
    public int getKlass() {
        return this.klass;
    }

    public String introduce() {
        return super.basicIntroduce()+ " I am a Student. I am at Class "+this.getKlass()+".";
    }
}
