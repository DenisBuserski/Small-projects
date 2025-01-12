package Classes.quadrant-point;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x coordinate:");
        int num1 = scanner.nextInt();
        System.out.println("Enter y coordinate:");
        int num2 = scanner.nextInt();
        Point point = new Point(num1, num2);
        System.out.println("Quadrant " + point.quadrant());
    }
}
