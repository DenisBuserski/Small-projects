package Polymorphism.overloading-example;

public class Overload {

    public void test(int number) {
        System.out.println("a " + number);
    }

    public void test(int num1, int num2) {
        System.out.println("a and b " + num1 + "," + num2);
        System.out.println("char a");
    }

    public int test(char symbol) {
        return Integer.valueOf(symbol);
    }
}
