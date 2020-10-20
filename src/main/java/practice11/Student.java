package practice11;


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
            return super.introduce() +  String.format(" I am a Student. I am Leader of Class %s.",klass.getNumber());
        }
        return super.introduce() +  String.format(" I am a Student. I am at Class %s.",klass.getNumber());
    }
}
