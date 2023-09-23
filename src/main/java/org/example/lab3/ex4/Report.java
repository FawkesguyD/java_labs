package org.example.lab3.ex4;

import java.util.ArrayList;

class Report{
    private ArrayList<Employee> office = new ArrayList<>();
    public void FillEmployees() {
        office.add(new Employee("Kate", 90000.0));
        office.add(new Employee("Daniel", 120000.0));
        office.add(new Employee("John", 50000.0));

    }
    public void generateReport() {
        for (Employee employee: office) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        Report report = new Report();
        report.FillEmployees();
        report.generateReport();
    }
}
