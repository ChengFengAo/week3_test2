package practice02;

public class Person {
    String name;
    int age;
     Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public String introduce() {
        String result="My name is " +this.name +"."+" I am " +this.age+" years old.";
        return result;
    }
}
