package practice09;

public class Person {
    private String name;
    private int age;
    private int id;
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is "+this.getName()+". I am "+this.getAge()+" years old.";
    }

    public  boolean equals(Object obj){
        Boolean result=false;
        if(obj instanceof  Person)
        {
            Person p=(Person) obj;
            if (this.getId()==p.getId()) {
                result=true;
            }

        }
        else {
            result=false;
        }
        return result;
    }



}
