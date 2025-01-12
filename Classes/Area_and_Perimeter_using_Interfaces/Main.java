package EXERCISE.programmr_com.Classes.Area_and_Perimeter_using_Interfaces;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double area, peri;
        System.out.print("Menu-\n1. Circle\n2. Rectangle\n3. Square\nEnter your choice :");
        int ch = sc.nextInt();


        switch (ch) {
            case 1:
                Circle circ = new Circle(sc);
                area = circ.area();
                peri = circ.peri();
                System.out.print("Area of Circle is :" + area + "\nPerimeter of Circle is :" + peri);
                break;
            case 2:
                Rec rec = new Rec(sc);
                area = rec.area();
                peri = rec.peri();
                System.out.print("Area of Rectangle is :" + area + "\nPerimeter of Rectangle is :" + peri);
                break;
            case 3:
                Square sqr = new Square(sc);
                area = sqr.area();
                peri = sqr.peri();
                System.out.print("Area of Square is :" + area + "\nPerimeter of Square is :" + peri);
                break;
            default:
                System.out.print("Wrong choice");
        }
    }
}
