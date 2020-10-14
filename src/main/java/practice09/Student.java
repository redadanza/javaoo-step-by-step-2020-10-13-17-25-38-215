package practice09;



public class Student extends Person {

    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        if(getKlass().getLeader() != null){
            return super.introduce() +  " I am a Student. I am Leader of Class 2.";
        }
        return super.introduce() +  " I am a Student. I am at Class 2.";
    }

}