package employee;

public class Employee implements Comparable<Employee>, Cloneable {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public Employee clone() {
        return new Employee(name, age, salary);
    }

    @Override
    public String toString() {
        return name + " (" + age + ") - $" + salary;
    }
}
