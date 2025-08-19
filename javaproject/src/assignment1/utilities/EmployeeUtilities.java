package assignment1.utilities;

import assignment1.employees.*;

public class EmployeeUtilities {
    public static void giveRaise(Employees employee, double amount) {
        employee.setSalary(employee.getSalary() + amount);
    }

    // Method to print employee details
    public static void print(Employees employee) {
        System.out.println(employee.empprint());
        
        System.out.println("-------------------");
    }
}
