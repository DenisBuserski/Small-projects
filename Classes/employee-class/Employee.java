package Classes.employee-class;

public class Employee {
    public String firstName;
    public String lastName;
    public double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSalary(salary);
    }

    public String getFirst() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }
}
