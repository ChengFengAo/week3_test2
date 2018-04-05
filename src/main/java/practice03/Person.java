package practice03;

public class Person {
    String name;
    int age;
    Person(String name,int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return  this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String introduce() {
        String result= "My name is "+getName()+"."+ " I am "+getAge()+" years old.";
        return result;
    }
}
