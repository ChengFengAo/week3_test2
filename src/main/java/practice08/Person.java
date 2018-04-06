package practice08;

public class Person {
    private String name;
    private int age,id;

    public Person(int id,String name,int age) {
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String introduce() {
        return "My name is "+this.getName()+". I am "+ this.getAge()+" years old.";
    }
}
