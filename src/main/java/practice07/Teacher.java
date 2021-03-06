package practice07;

public class Teacher extends Person {

    private Klass klass;
    private int flag =0;

    public Klass getKlass() {
        return klass;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        flag = 1;
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
        flag=2;
    }


    public String introduce(){
        if(klass == null)
        {
            return super.introduce() +  " I am a Teacher. I teach No Class.";
        }
        return super.introduce() +  " I am a Teacher. I teach Class 2.";
    }
    public String introduceWith(Student name){
        if(this.klass.getNumber()== name.getKlass().getNumber())
        {
            //System.out.println("number  is: " + klass.getNumber());
            return super.introduce() +  " I am a Teacher. I teach Jerry.";

        }
        return super.introduce() +  " I am a Teacher. I don't teach Jerry.";


    }
}