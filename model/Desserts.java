package model;

public class Desserts extends MenuItem {
    private boolean isVegan;

    public Desserts(String name, double price, boolean isVegan) {
        super(name, price);
        this.isVegan = isVegan;
    }

    public boolean isVegan() { return isVegan; }

    @Override
    public String toString() {
        return super.toString() + ", Vegan: " + (isVegan ? "Yes" : "No");
    }
}
