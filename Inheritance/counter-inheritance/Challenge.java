package Inheritance.counter-inheritance;

public class Challenge extends Counter {
    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.increment();
        counter.increment();
        counter.increment();

        counter.print();
    }
}
