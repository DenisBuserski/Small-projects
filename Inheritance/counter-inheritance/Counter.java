package Inheritance.counter-inheritance;

public class Counter {
    int i = 0;
    Counter increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }
}
