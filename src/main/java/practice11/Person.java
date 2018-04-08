package practice11;

public class Person {
    private String name;
    private int age,id;

    public Person(int id,String name,int age) {
        this.id = id;
        this.name=name;
        this.age=age;
    }

    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }

    public String introduce() {
        return "My name is "+getName()+". I am "+getAge()+" years old.";
    }
    public int hashCode() {
        return id;

    }
    public  boolean equals(Object obj){
        Boolean result=false;
        if(obj instanceof Person)
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
