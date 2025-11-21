package model;

public class Cake extends MenuItem {
    private boolean isCustom;

    public Cake(String name, double price, boolean isCustom) {
        super(name, price);
        this.isCustom = isCustom;
    }

    public boolean isCustom() { return isCustom; }

    @Override
    public String toString() {
        return super.toString() + ", Custom Made: " + (isCustom ? "Yes" : "No");
    }
}
