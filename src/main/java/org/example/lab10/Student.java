package org.example.lab10;

public class Student {
    private String name;
    private String surname;
    private int ID;
    private int course;
    private String group;

    public Student(String name, String surname, int ID, int course, String group) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.course = course;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getID() {
        return ID;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + ID +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
