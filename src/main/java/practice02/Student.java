package practice02;

public class Student extends Person {
    //String name;
    int kclass;
    Student(String name, int age, int kclass) {
        super(name, age);
        this.kclass = kclass;
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return  super.getAge();
    }

    public int getKlass() {
        return  this.kclass;
    }

    public String introduce() {
        String result = "I am a Student. I am at Class "+this.kclass+".";
        return result;
    }
}
