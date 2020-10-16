package practice10;

import java.util.LinkedList;

public class Teacher extends Person {

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
    }
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);

        this.klass = klass;
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);

    }


    public String introduce(){
        //implement logic from klass list
//        try {
//            if (classes.size() != 0) {
//                return super.introduce() + " I am a Teacher. I teach Class 2, 3.";
//            }
//        }
//        catch (Exception e){
//            //catch method
//        }
//
//        if(klass == null)
//        {
//            return super.introduce() +  " I am a Teacher. I teach No Class.";
//        }
//
//        return super.introduce() +  " I am a Teacher. I teach Class 2";
        String classesNum = "";
        for (int index = 0; index < classes.size();index++){
            classesNum += classes.get(index).getNumber();
            if(!((classes.size() - index) == 1)){
                classesNum += ", ";
            }
        }
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
}
