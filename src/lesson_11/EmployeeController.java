package lesson_11;

import java.util.List;

public class EmployeeController {
    public int calculateTotalSalary(List<Employee> employeeList) {
        int salary = 0;
        for (Employee employee : employeeList) {
            if (employee instanceof FTE) {
                // casting | BAD practice
                // this is breaking the IS-A relationship
                FTE fte = (FTE) employee;
                salary = salary + ((FTE) fte).getSupportMoney() + employee.getSalary();
            } else {
                salary = salary + employee.getSalary();
            }
        }
        return salary;
    }
}

    /* => solution:
     * 1. create a getSupportMoney() in Employee
     * 2. override this method in FTE object
     * 3. salary = salary + employee.getSalary() + employee.getSupportMoney();
     */
