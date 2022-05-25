package model;

public class Customer {
    private String name;
    private int age;
    private int id;

    public Customer(int id,String name ,int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Customer() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
