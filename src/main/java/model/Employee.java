package model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String surname;
    private String middleName;
    private String position;

    @ManyToOne
    private Department department;

    @ManyToMany(mappedBy = "executors")
    private Set<Assignment> assignmentSet;

    public Employee() {
    }

    public Employee(String name, String surname, String middleName, String position, Department department, Set<Assignment> assignmentSet) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.position = position;
        this.department = department;
        this.assignmentSet = assignmentSet;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPosition() {
        return position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString(){
        return "\nEmployee:\n" + "name: " + name + "\nsurname:" + surname +
                "\nmiddlename: " + middleName + "\nposition: " + position+
                "\ndepartment: " + department;
    }
}
