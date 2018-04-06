package practice08;

public class Student extends Person{
    private Klass klass;
    public Student(int id,String name,int age,Klass klass) {
        super(id,name,age);
        this.klass=klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        String result="";
        if (this.getKlass().getLeader()==null) {
            result=super.introduce()+" I am a Student. I am at Class "+this.getKlass().getNumber()+".";

        }
        else
            if(this.getKlass().getLeader().getId()==this.getId())
        {
            result= super.introduce()+" I am a Student. I am Leader of Class "+this.getKlass().getNumber()+".";
        }
        return result;
    }
}
