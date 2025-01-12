package Inheritance.area-circle-using-inheritance;

public class Circle extends CircleShape {
    private double area;

    public double area() {
        return radius * radius * 3.14;
    }


    public String getDisplayText() {
       return String.format("Radius %.1f and Area is %.1f", radius, area());
    }
}
