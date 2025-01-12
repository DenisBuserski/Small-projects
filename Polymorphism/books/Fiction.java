package Polymorphism.books;

public class Fiction extends Book {
    private double price;

    public Fiction(String title) {
        super(title);
        this.setPrice();
    }

    @Override
    public double setPrice() {
        return 24.99;
    }
}
