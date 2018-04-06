package practice08;

public class Klass {
    private Student leader;
    private int number;

    public Klass(int number) {
        this.number = number;
    }

  /*  public Klass getKlass() {
        return this;
    }*/
    public int getNumber() {
        return this.number;
    }
    public String getDisplayName() {
        return "Class "+this.getNumber();
    }

    public void assignLeader(Student student) {  //add leader
        leader=student;
    }

    public Student getLeader() {    //get leader
        return leader;
    }
}
