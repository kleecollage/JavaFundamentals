package test;

import person.Person;

public class TestPerson {

    public static void main(String[] args) {
        System.out.println("static variable: " + Person.getNumberOfPersons());
        Person person = new Person("John", "Doe");
        // person.setName("John");
        // person.setLastname("Doe");
        person.showPersonName();

        Person person2 = new Person("Jane", "Smith");
        person2.showPersonName();

        System.out.println(person.toString());
        System.out.println(person2);

        System.out.println("static variable: " + Person.getNumberOfPersons());
    }
}
