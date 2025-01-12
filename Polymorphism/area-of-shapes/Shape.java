package Polymorphism.area-of-shapes;

public class Shape {
    public double area(double num1, double num2) {
        if (num1 != num2) {
            return num1 * num2;
        } else {
            return num1 * num2;
        }
    }
    public double area(double num1) {
        return Math.PI * (num1 * num1);
    }
    public double area(double num1, double num2, double num3) {
        double P = (num1 + num2 + num3) / 2;
        double P1 = P * (P - num1) * (P - num2) * (P - num3);
        double P2 = Math.sqrt(P1);
        return P2;
    }
}
