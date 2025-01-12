package Inheritance.method-overriding;

import java.util.Scanner;

class Challenge {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter the 3rd number:");
        int num3 = scanner.nextInt();
        B obj = new B(num1, num2, num3);
        obj.show();
    }
}
