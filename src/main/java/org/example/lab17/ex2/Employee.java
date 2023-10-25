package org.example.lab17.ex2;

public class Employee {
    private String Name;
    private String rollNo;
    private int pay;

    public Employee(String name, String rollNo, int pay) {
        this.Name = name;
        this.rollNo = rollNo;
        this.pay = pay;
    }

    public String getName() {
        return Name;
    }

    public String getrollNo() {
        return rollNo;
    }

    public int getPay() {
        return pay;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setrollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public void updateEmployee(String name, String rollNo, int pay) {
        this.Name = name;
        this.rollNo = rollNo;
        this.pay = pay;
    }
}
