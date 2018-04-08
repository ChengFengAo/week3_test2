package practice10;
import java.util.*;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private Set<Klass> classes=new HashSet<>();
    public Teacher(int id, String name, int age) {
        super(id,name,age);
    }
    public Teacher(int id, String name, int age,HashSet<Klass> c) {
        super(id, name, age);
        this.classes=c;
    }
    public Set<Klass> getClasses() {
     return this.classes;
    }
    public String introduce() {
     String result="";
    String cl="";
    int i=0;
        List<Integer> contains= new ArrayList<>();
        if (this.getClasses().size()==0) {
            result=super.introduce()+" I am a Teacher. I teach No Class.";
        }
        else
            if(this.getClasses().size()!=0){
                Iterator<Klass>  cls=this.getClasses().iterator();
                while (cls.hasNext())
           {
               contains.add(cls.next().getNumber());
               i++;
           }
           List<Integer> tmp=contains.stream().sorted().collect(Collectors.toList());
                for (int j = 0; j < tmp.size(); j++) {
                    cl+=tmp.get(j)+","+" ";
                }
          result=super.introduce()+" I am a Teacher. I teach Class "+cl.substring(0,cl.length()-2)+".";
            }

         return result;
        }
        public Boolean isTeaching(Student student)
        {
          return Klass.isIn(student,this.getClasses());

        }

    public String introduceWith(Student student) {
       String result="";
       if(this.getClasses().contains(student.getKlass())){
           result=super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
       }
       else {
           result=super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
       }
       return result;
    }

    }


