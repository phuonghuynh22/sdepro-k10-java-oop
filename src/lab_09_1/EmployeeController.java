package lab_09_1;

import java.util.List;

public class EmployeeController {
   public int calculateTotalSalary(List<Employee> employeeList){
       int salary = 0;
       for (Employee employee : employeeList) {
           salary = salary + employee.getSalary();
       }
       return salary;
   }
}
