package javatraining.oletsky.oop.basicpracticum.afterrefactoring;

/**
 * @author O.Oletsky
 * The refactored basic class
 */

public class Person {
    private String fio;
    private int age;
    private String address;

    public Person(String fio, int age, String address) {
        this.setFio(fio);
        this.setAge(age);
        this.setAddress(address);
    }

    void sayHello() {
        System.out.println(this.getFio() +" says: Hello");
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
