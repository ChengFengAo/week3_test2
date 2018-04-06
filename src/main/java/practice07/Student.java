package practice07;

public class Student extends Person {

   private Klass kclass;
    public Student(String name, int age, Klass kclass) { //传递的参数为对象
        super(name, age);
        this.kclass = kclass;
    }

    public Klass getKlass() {
        return this.kclass;
    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + this.getKlass().getNumber() + ".";//调用对象的方法获取属性值
    }
}
