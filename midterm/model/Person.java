package midterm.model;

public class Person {
    private String name;
    private String surName;
    private int age;
    private long personalNumber;

    @Override
    public String toString() {
        return String.format("Name=%s; surName=%s; age=%d; personalNumber=%d", this.name, this.surName, this.age, this.personalNumber);
    }

    public Person(String name, String surName, int age, long personalNumber) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.personalNumber = personalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(long personalNumber) {
        this.personalNumber = personalNumber;
    }
}
