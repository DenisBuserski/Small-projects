package Polymorphism.books;

public class NonFiction extends Book {
    private double price;

    public NonFiction(String title) {
        super(title);
        this.setPrice();
    }

    @Override
    public double setPrice() {
        return 37.99;
    }
}
