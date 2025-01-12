package Inheritance.purchased-item;

public class CountedItem extends PurchaseItem {
    private int quantity;

    public CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.quantity + " units " + (getPrice() * quantity) + " $"; // "CountedItem{" + "quantity=" + quantity + '}';
    }
}
