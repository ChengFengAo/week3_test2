package practice04;

public class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String basicIntroduce(){
     return "My name is "+this.getName()+"."+" I am "+this.getAge()+" years old.";
    }

    public String introduce() {
       return basicIntroduce();
    }
}
