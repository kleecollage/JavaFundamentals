package person;

public class Person {
    private String name;
    private String lastname;
    private String email;
    private String phone;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.email = "";
        this.phone = "";
    }

    public void showPersonName() {
        System.out.println("Name: " + name);
        System.out.println("Lastname: " + lastname);
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
