package Polymorphism.books;

public abstract class Book {
    private String title;
    private double price;

    public Book(String title) {
        this.title = title;
        this.setPrice(setPrice());
    }

    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double setPrice();

    @Override
    public String toString() {
        return "Title-" + getTitle() + " Cost-$" + getPrice();
    }
}
