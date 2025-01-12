package EXERCISE.programmr_com.Classes.Circle_class;

public class myCircle {
    public double radius;
    public String color;

    public myCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
