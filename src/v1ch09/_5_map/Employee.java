package v1ch09._5_map;

/**
 * A minimalist _4_employee class for testing purposes.
 */
public class Employee {
    private String name;
    private double salary;

    /**
     * Constructs an _4_employee with $0 salary.
     *
     * @param n the _4_employee name
     */
    public Employee(String name) {
        this.name = name;
        salary = 0;
    }

    public String toString() {
        return "[name=" + name + ", salary=" + salary + "]";
    }
}
