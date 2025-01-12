package Inheritance.purchased-item;

public class WeighedItem extends PurchaseItem {
    private double weightKg;

    public WeighedItem(String name, double unitPrice, double weightKg) {
        super(name, unitPrice);
        this.weightKg = weightKg;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.weightKg + " Kg " + (getPrice() * weightKg) + " $";
    }
}
