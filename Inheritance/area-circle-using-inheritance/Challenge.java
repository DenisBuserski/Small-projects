package Inheritance.area-circle-using-inheritance;

import java.util.Scanner;

public class Challenge {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius:");
        double radius = scanner.nextDouble();
        new Challenge().method(radius);
    }

    public void method(double radius) {
        Circle myCircle = new Circle();
        myCircle.setradius(radius);
        System.out.print(myCircle.getDisplayText());
    }
}
