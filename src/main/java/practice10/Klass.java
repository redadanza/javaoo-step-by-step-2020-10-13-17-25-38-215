package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Object leader;
    private Object student;
    private List<Student> members = new ArrayList<>();
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
    public void assignLeader(Student student){
        if(members.contains(student))
        {
            this.leader = student;
        }
        else{
            System.out.print("It is not one of us.\n");
        }

    }
    public void appendMember(Student member){

        members.add(member);
    }
}
