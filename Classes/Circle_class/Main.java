package EXERCISE.programmr_com.Classes.Circle_class;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter radius:");
        double rad = scanner.nextDouble();
        System.out.println("Enter color:");
        String col = scanner.next();

        myCircle mc = new myCircle(rad, col);

        System.out.println(mc.getArea());
        System.out.println(mc.color);
    }
}
