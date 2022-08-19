package serial;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private String iD;
    private String firstName;
    private String lastName;
    private int age;
    private Date dOB;
    private int salary;

    public Employee() {

    }

    public String getID() {
        return this.iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDOB() {
        return this.dOB;
    }

    public void setDOB(Date dOB) {
        this.dOB = dOB;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" + "\niD :" + iD + "\nfirstName :" + firstName + "\nlastName :" + lastName + "\ndOB :"
                + dOB.toString() + "}";
    }

}
