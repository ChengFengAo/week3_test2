package practice08;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private String name;
    private int age,id;
   // private Set<Person> persongs= new  HashSet<>();
    public Person(int id,String name,int age) {
        //this.id=id.hashCode;
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

   /* public int hashCode() {
        return id;

    }*/
    public  boolean equals(Object obj){
        Boolean f=false;
        if (obj instanceof Person)
        {
            Person p= (Person) obj;
            if(p.getId()==((Person) obj).getId())
            {
                f=true;
            }
            else {
                f=false;
            }
        }
        return f;
    }
}
