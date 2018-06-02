package model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Assignment {

    @Id
    @GeneratedValue
    private long id;

    private String theme;

    @ManyToOne
    private Employee author;

    @ManyToMany
    @JoinTable(name="assignments_executors",
            joinColumns = @JoinColumn(name="assignment_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="executor_id", referencedColumnName="id"))
    private Set<Employee> executors;


    private int time;
    private boolean control;
    private String text;
    private boolean execution;
    private String status;

    public Assignment() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Employee getAuthor() {
        return author;
    }

    public void setAuthor(Employee author) {
        this.author = author;
    }

    public Set<Employee> getExecutors() {
        return executors;
    }

    public void setExecutors(Set<Employee> executors) {
        this.executors = executors;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean getControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean getExecution() {
        return execution;
    }

    public void setExecution(boolean execution) {
        this.execution = execution;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "\nAssignment:\n" + "theme: " + theme + "\nauthor:" + author +
                "\nexecutors: " + executors + "\ntime: " + time + "\ncontrol: " + control +
                "\ntext: " + text + "\nexecution: " + execution + "\nstatus: " + status;
    }
}
