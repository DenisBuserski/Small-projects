package EXERCISE.programmr_com.Classes.Area_and_Perimeter_using_Interfaces;

import java.util.Scanner;

public class Circle implements Shape {

    private double radius;

    public Circle(Scanner scanner) {
        this.radius = scanner.nextInt();
    }
    @Override
    public double area() {
        return Math.PI + radius * radius;
    }

    @Override
    public double peri() {
        return 2 * Math.PI + radius;
    }
}
