package practice07;

public class Teacher extends Person {

    private Klass klass;


    public Klass getKlass() {
        return klass;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }


    public String introduce(){
        if(klass == null)
        {
            return super.introduce() +  " I am a Teacher. I teach No Class.";
        }
        return super.introduce() +  " I am a Teacher. I teach Class 2.";
    }
    public String introduceWith(Student name){
        if(klass != null)
        {
            return super.introduce() +  " I am a Teacher. I don't teach Jerry.";
        }
        return super.introduce() +  " I am a Teacher. I teach Jerry.";

    }
}