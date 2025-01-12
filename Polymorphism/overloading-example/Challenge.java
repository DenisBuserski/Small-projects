package Polymorphism.overloading-example;

public class Challenge {
    public static void main(String args[]) {
        Overload overload = new Overload();
        int result;
        overload.test(10);
        overload.test(10, 20);
        result = overload.test('a');
        System.out.println("Result " + result);
    }
}
