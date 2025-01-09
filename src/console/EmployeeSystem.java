package console;

import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {
        System.out.println( "*** Employee System ***");
        var console = new Scanner(System.in);
        // Employee name
        System.out.print("Enter employee name: ");
        var nameEmployee = console.nextLine();
        // Employee age
        System.out.print("Enter the employee age: ");
        var ageEmployee = Integer.parseInt(console.nextLine());
        // Employee salary
        System.out.print("Employee salary: ");
        var salaryEmployee = Double.parseDouble(console.nextLine());
        // Department head
        System.out.print("Is department head (true/false)?: ");
        var isDepartmentHead = Boolean.parseBoolean(console.nextLine());
        // Print values
        System.out.println("\nEmployee Data:");
        System.out.println("\tName: " + nameEmployee);
        System.out.println("\tAge:" + ageEmployee);
        System.out.printf("\tSalary: $%.2f%n", salaryEmployee);
        System.out.println("\tIs department head: " + isDepartmentHead);
    }
}
