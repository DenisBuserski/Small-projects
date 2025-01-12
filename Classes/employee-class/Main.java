package Classes.employee-class;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        String first = scanner.nextLine();
        System.out.println("Enter last name:");
        String last = scanner.nextLine();
        System.out.println("Enter monthly salary:");
        double salary = scanner.nextDouble();
        Employee e1 = new Employee(first, last, salary);

        System.out.println("First name:" + e1.getFirst());
        System.out.println("Last name:" + e1.getLast());
        System.out.println("Salary:" + e1.getSalary());
    }
}
