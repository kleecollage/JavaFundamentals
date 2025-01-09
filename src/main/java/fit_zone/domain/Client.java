package fit_zone.domain;

import java.util.Objects;

public class Client {
    private int id;
    private String name;
    private String lastname;
    private int membership;

    public Client() {
    }

    // CONSTRUCTOR FOR GET CLIENT
    public Client(int id) {
        this.id = id;
    }

    // CONSTRUCTOR FOR ADD CLIENT
    public Client(String name, String lastname, int membership) {
        this.name = name;
        this.lastname = lastname;
        this.membership = membership;
    }

    // CONSTRUCTOR FOR GETTING OBJECT CLIENT
    public Client(int id, String name, String lastname, int membership) {
        this(name, lastname, membership);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getMembership() {
        return membership;
    }

    public void setMembership(int membership) {
        this.membership = membership;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", membership=" + membership +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;
        return id == client.id && membership == client.membership && Objects.equals(name, client.name) && Objects.equals(lastname, client.lastname);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(lastname);
        result = 31 * result + membership;
        return result;
    }
}
