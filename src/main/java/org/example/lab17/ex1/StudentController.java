package org.example.lab17.ex1;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
         model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void updateView(String name, String rollNo) {
        view.printStudentDetails(rollNo, name);
    }

    public void displayView() {
        view.printStudentDetails(model.getRollNo(), model.getName());
    }
}
