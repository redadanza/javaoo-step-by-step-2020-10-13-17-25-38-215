package practice05;

public class Student extends Person {
    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {

        return klass;
    }


    public Student(String name, int age) {
        super(name, age);
    }
    public String introduce(){
        return super.basicIntroduce() +  " I am a Student. I am at Class 2.";
    }
}