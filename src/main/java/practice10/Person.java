package practice10;

public class Person {
    private String name;
    private int id,age;

    public Person(int id,String name,int age) {
        this.name = name;
        this.id=id;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }

    public String introduce() {
        return "My name is "+getName()+". I am "+getAge()+" years old.";
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
