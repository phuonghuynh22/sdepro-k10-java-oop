package lesson_12_has_a_relationship;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {
        Employee teo = new Employee("tzeo", 10, 10);
        Employee ti = new Employee("ti", 11, 19);
        Employee tun = new Employee("tpun", 9, 20);

        List<Employee> employeeList = Arrays.asList(teo, ti, tun);
        System.out.println("BEFORE=======");
        System.out.println(employeeList);

        System.out.println("AFTER=======");
        Collections.sort(employeeList); //only works in case there is a HAS-A relationship
        System.out.println(employeeList);

        System.out.println("SORT BY AGE=======");
        //Collections.sort(employeeList,new EmployeeAgeComparator()); using ether this line of code or the below line
        employeeList.sort(new EmployeeAgeComparator());
        System.out.println(employeeList);

        System.out.println("SORT BY NAME=======");
        employeeList.sort(new EmployeeNameComparator());
        System.out.println(employeeList);
    }
}
