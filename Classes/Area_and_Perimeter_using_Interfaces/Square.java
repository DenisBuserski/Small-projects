package EXERCISE.programmr_com.Classes.Area_and_Perimeter_using_Interfaces;

import java.util.Scanner;

public class Square implements Shape {
    private double side;


    public Square(Scanner scanner) {
        this.side = scanner.nextInt();
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double peri() {
        return 4 * side;
    }
}
