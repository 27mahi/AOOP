package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 50000));
        employees.add(new Employee("Bob", 25, 45000));
        employees.add(new Employee("Charlie", 35, 55000));

        Collections.sort(employees);
        employees.forEach(System.out::println);

        Collections.sort(employees, new SalaryComparator());
        employees.forEach(System.out::println);
    }
}
