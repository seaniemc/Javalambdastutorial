package com.ericsson;

/**
 * Created by smcgrath on 7/5/2017.
 */
public class Person {
    private String firstName;
    private String lastNmae;
    private int age;

    public Person(String firstName, String lastNmae, int age) {
        super();
        this.firstName = firstName;
        this.lastNmae = lastNmae;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNmae() {
        return lastNmae;
    }

    public void setLastNmae(String lastNmae) {
        this.lastNmae = lastNmae;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastNmae='" + lastNmae + '\'' +
                ", age=" + age +
                '}';
    }
}
