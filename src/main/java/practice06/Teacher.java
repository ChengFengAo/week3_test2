package practice06;

public class Teacher extends Person {
    private int klass;

     Teacher(String name, int age) {
        super(name, age);
    }

    Teacher(String name, int age, int klass) {
        this(name, age);
        this.klass = klass;
    }

    public int getKlass() {

        return this.klass;
    }

    public String introduce() {
        String result="" ;
        if (this.getKlass()==0) {
            result = super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            result=super.introduce()+" I am a Teacher. I teach Class "+this.getKlass()+".";
        }
        return result;

    }

}