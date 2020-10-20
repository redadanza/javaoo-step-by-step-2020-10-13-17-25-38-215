package practice11;

import java.util.LinkedList;
import java.util.stream.IntStream;

public class Teacher extends Person implements Observer{

    private Klass klass;

    private LinkedList<Klass> classes = new LinkedList<>();

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public Klass getKlass() {
        return klass;
    }
    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.forEach(klass1 -> klass1.addObservers(this));
    }
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);

    }


    public String introduce(){
        StringBuilder classesNum = new StringBuilder();
        IntStream.range(0, classes.size()).forEach(index -> {
            classesNum.append(classes.get(index).getNumber());
            if (!((classes.size() - index) == 1)) {
                classesNum.append(", ");
            }
        });
        return classes.size() != 0 ? super.introduce()+ " " + "I am a Teacher. I teach Class "+ classesNum +"." : super.introduce()+ " " + "I am a Teacher. I teach No Class.";
    }
    public String introduceWith(Student name){
        if(classes.contains(name.getKlass()))
        {
            //System.out.println("number  is: " + klass.getNumber());
            return super.introduce() +  " I am a Teacher. I teach Jerry.";

        }
        return super.introduce() +  " I am a Teacher. I don't teach Jerry.";


    }
    public  boolean isTeaching(Student student){


        return classes.contains(student.getKlass());
    }

    @Override
    public void notifyNewStudent(Student student, Klass klass) {
        System.out.print(String.format("I am %s. I know %s has joined %s.\n", this.getName(), student.getName(),
                klass.getDisplayName()));
    }

    @Override
    public void notifyAssignLeader(Student student, Klass klass) {
        System.out.print(String.format("I am %s. I know %s become Leader of %s.\n", this.getName(), student.getName(),
                klass.getDisplayName()));
    }
}
