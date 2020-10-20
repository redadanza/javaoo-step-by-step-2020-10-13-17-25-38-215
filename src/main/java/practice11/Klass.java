package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Object leader;
    private List<Student> members = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
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
            observers.forEach(observer -> observer.notifyAssignLeader(student,this));
        }
        else{
            System.out.print("It is not one of us.\n");
        }

    }
    public void appendMember(Student member){

        members.add(member);
        observers.forEach(observer -> observer.notifyNewStudent(member,this));
    }
    public void addObservers(Observer observer){
        observers.add(observer);
    }
}
