package model;

public class Drinks extends MenuItem {
    private boolean isHot;

    public Drinks(String name, double price, boolean isHot) {
        super(name, price);
        this.isHot = isHot;
    }

    public boolean isHot() { return isHot; }

    @Override
    public String toString() {
        return super.toString() + ", Hot: " + (isHot ? "Yes" : "No");
    }
}
