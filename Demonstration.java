package javatraining.oletsky.oop.basicpracticum.afterrefactoring;

public class Demonstration {
    public static void main(String[] args) {
        Person p1 = new Person("Ivanov", 102, "Paris, Monmartr");
        Person p2 = new Person("Petrova", 25, "SAS Radisson");
        p1.sayHello();
        p2.sayHello();
        System.out.println(p1.getFio() +" is "+ p1.getAge() +" years old");

    }
}

