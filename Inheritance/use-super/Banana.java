package Inheritance.use-super;

public class Banana extends Apple {
    int number_of_items;
    int number_of_apples;

    public Banana(int apples, int bananas) {
        this.number_of_apples = apples;
        this.number_of_items = bananas;
    }

    public int getNumber_of_items() {
        return number_of_items;
    }

    public int getNumber_of_apples() {
        return number_of_apples;
    }

    public void show() {
        System.out.println("Number of apples:" + getNumber_of_apples());
        System.out.println("Number of bananas:" + getNumber_of_items());

    }
}
