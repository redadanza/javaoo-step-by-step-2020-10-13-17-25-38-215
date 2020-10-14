package practice10;


public class Klass {
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

        if(student.getKlass().getNumber() == 5)
        {
            System.out.print("It is not one of us.\n");
            return null;
        }
        else{
            leader = student;
        }

        return student;
    }
    public Object appendMember(Student student){

        return student;
    }
}
