package practice07;

public class Student extends Person {

    private  Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        //get display name instead
        return super.introduce() +  " I am a Student. I am at Class 2.";
    }

}
