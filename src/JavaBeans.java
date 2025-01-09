import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setSurname("Doe");
        System.out.println("person = " + person);
        System.out.println("Name: " + person.getName());
        System.out.println("Surname: " + person.getSurname());
    }
}

class Person implements Serializable {
    private String name;
    private String surname;

    public Person() {}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
