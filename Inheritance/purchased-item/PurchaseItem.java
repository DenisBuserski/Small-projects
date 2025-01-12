package Inheritance.purchased-item;

public class PurchaseItem {
    private String name;
    private double unitPrice;

    public PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.setPrice(unitPrice);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double unitPrice) {
        this.unitPrice = (unitPrice > 0) ? unitPrice : 0;
    }

    public double getPrice() {
        return unitPrice;
    }

    public String toString() {
        return getName() + "@ " + getPrice();
    }
}
