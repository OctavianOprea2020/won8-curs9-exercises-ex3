package curs9.homework09.ex3;

public class Person {

    private String name;
    private int age;
    private String position;

    public Person() {
    }

    public Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isPosition(String position) {
        return (this.position == position);
    }

    public void printPerson() {
        System.out.println("Name: " + name + ", age: " + age + ", position: " + position);
    }
}
