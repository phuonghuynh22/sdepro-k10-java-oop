package lesson_11_abstraction;

import lesson_11_abstraction.Employee;
import lesson_11_abstraction.FTE;

import java.util.List;

public class EmployeeController {
    public int calculateTotalSalary(List<Employee> employeeList) {
        int salary = 0;
        for (Employee employee : employeeList) {

            salary = salary + employee.getSalary() + employee.getSupportMoney();
        }
        return salary;
    }
}