package org.example.lab17.ex2;

public class main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "john@gmail.com", 50000);
        EmployeeView employeeView = new EmployeeView();
        EmployeeController employeeController = new EmployeeController(employee, employeeView);

        // Отображение начальных данных сотрудника
        employeeController.displayEmployee();

        // Изменение данных сотрудника
        employeeController.setEmployeeName("Jane Smith");
        employeeController.setEmployeeRollNo("jane@gmail.com");
        employeeController.setEmployeePay(55000);

        // Обновление данных сотрудника
        employeeController.updateDetails("James Brown", "brown@gmail.com", 60000);

        // Отображение обновленных данных сотрудника
        employeeController.displayEmployee();
    }
}

