package v1ch04._2_EmployeeTest;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        // raise everyone's salary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);
        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.name + ",salary=" + e.salary + ",hireDay=" + e.hireDay);


        System.out.println("numEmployee " + Employee.numEmployee);
    }


}


class Employee {
    public String name;
    public double salary;
    public LocalDate hireDay;

    static int numEmployee = 0;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
        numEmployee++;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
