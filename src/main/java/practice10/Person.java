package practice10;


import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int id;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person otherPerson = (Person) o;
        return age == otherPerson.age &&
                id == otherPerson.id && Objects.equals(name, otherPerson.name);
    }

    public int getId() {
        return id;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }
    public String introduce(){
        return "My name is Tom. I am 21 years old.";
    }
    public String basicIntroduce(){
        return "My name is Tom. I am 21 years old.";
    }
    public String introduceWith(Student name){
        return String.format("I teach Jerry");

    }

}
