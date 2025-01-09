package test;

import person.Person;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        // person.setName("John");
        // person.setLastname("Doe");
        person.showPersonName();

        Person person2 = new Person("Jane", "Smith");
        // person2.setName("Jane");
        // person2.setLastname("Smith");
        person2.showPersonName();
    }
}
