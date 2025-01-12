package Classes.print-using-to-string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name:");
        String name = scanner.next();
        System.out.print("Enter the age:");
        String age = scanner.next();

        Challenge test = new Challenge(name, age);
        System.out.println(test);
    }
}
