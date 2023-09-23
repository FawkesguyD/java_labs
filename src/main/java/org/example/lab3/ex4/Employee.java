package org.example.lab3.ex4;

import java.util.ArrayList;

class Employee {
    private String fullname;
    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public String getFullname() {
        return fullname;
    }

    public Employee(String fullname, Double salary) {
           this.fullname = fullname;
           this.salary = salary;

    }

    @Override
    public String toString() {
        return fullname + " | salary " + salary;
    }
}
