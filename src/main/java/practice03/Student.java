package practice03;

public class Student extends Person {
    int kclass;

    Student(String name, int age, int kclass) {
        super(name,age);
        this.kclass=kclass;
    }

/*
    @Override
    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }
*/
    public int getKlass() {
        return this.kclass;
    }

    public String introduce() {
        String result ="I am a Student. I am at Class " + getKlass()+".";
        return result;
    }
}
