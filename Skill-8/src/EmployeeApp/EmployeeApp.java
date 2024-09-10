package EmployeeApp;

import java.util.*;
import java.util.stream.*;

public class EmployeeApp {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30, 50000),
            new Employee("Bob", 25, 60000),
            new Employee("Charlie", 35, 55000),
            new Employee("David", 28, 52000),
            new Employee("Eve", 40, 65000),
            new Employee("Frank", 32, 57000),
            new Employee("Grace", 29, 53000),
            new Employee("Hank", 45, 70000),
            new Employee("Ivy", 26, 49000),
            new Employee("Jack", 38, 68000)
        );

        // Filtering employees with salary > 55000
        List<Employee> filtered = employees.stream()
            .filter(e -> e.salary > 55000)
            .collect(Collectors.toList());

        // Sorting employees by salary
        List<Employee> sorted = employees.stream()
            .sorted(Comparator.comparingDouble(e -> e.salary))
            .collect(Collectors.toList());

        // Finding the employee with the highest salary
        Employee highestSalary = employees.stream()
            .max(Comparator.comparingDouble(e -> e.salary))
            .orElse(null);

        // Calculating the average salary
        double averageSalary = employees.stream()
            .mapToDouble(e -> e.salary)
            .average()
            .orElse(0);

        filtered.forEach(System.out::println);
        sorted.forEach(System.out::println);
        System.out.println("Highest Salary: " + highestSalary);
        System.out.println("Average Salary: " + averageSalary);
    }
}
