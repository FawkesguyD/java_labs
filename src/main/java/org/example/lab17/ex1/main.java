package org.example.lab17.ex1;

public class main {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        Student model = new Student();
        StudentController controller = new StudentController(model, view);

        model.setRollNo("example@test.com");
        model.setName("Test");

        controller.displayView();
        controller.updateView("Daniel", "gnitetskiy@gmail.com");
    }
}
