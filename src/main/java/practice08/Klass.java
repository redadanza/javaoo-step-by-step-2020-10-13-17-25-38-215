package practice08;

public class Klass{
    private int number;
    private Object leader;
    private Object student;

    public Object getLeader() {
        return leader;
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public String getDisplayName(){
        return "Class " + number;
    }
    public Object assignLeader(Student student){
        leader = student;
        return student;
    }

}

