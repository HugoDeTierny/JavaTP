package part3.exo19.users;

import java.util.Objects;

public class Customer {
    private String firstName;
    private String lastName;
    private int age;

    public Customer() {
        firstName = "John";
        lastName = "Smith";
        age = 30;
    }
    public Customer(String _firstName,String _lastName, int _age){
        firstName =    _firstName;
        lastName = _lastName;
        age =  _age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(lastName, customer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
