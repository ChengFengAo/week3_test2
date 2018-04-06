package practice07;

public class Klass {
   private int number=-1;

    public Klass(int number) {
        this.number = number;
    }
    public int getNumber() {
     return this.number;
    }

    public String getDisplayName() {
        return "Class "+this.getNumber();
    }
}
