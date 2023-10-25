package org.example.lab17.ex2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public String getEmployeeName() {
        return model.getName();
    }
    public String getEmployeeRollNo() {
        return model.getrollNo();
    }
    public int getEmployeePay() {
        return model.getPay();
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }
    public void setEmployeeRollNo(String rollNo) {
        model.setrollNo(rollNo);
    }
    public void setEmployeePay(int pay) {
        model.setPay(pay);
    }

    public void updateDetails(String name, String rollNo, int pay) {
        model.updateEmployee(name,rollNo,pay);
    }

    public void displayEmployee() {
        view.displayDetails(model.getName(), model.getrollNo(), model.getPay());
    }
}
