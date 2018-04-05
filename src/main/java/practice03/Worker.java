package practice03;

public class Worker extends Person{
    Worker(String name,int age) {
        super(name,age);
    }

    public String introduce() {                 //重写父类方法
        String result= "I am a Worker. I have a job.";
        return result;
    }
}
