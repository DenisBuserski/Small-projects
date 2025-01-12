package EXERCISE.programmr_com.Classes.Area_and_Perimeter_using_Interfaces;

import java.util.Scanner;

public class Rec implements Shape {

    private double length;
    private double width;

    public Rec(Scanner scanner) {
        this.length = scanner.nextInt();
        this.width = scanner.nextInt();
    }
    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double peri() {
        return 2 * length * width;
    }
}
