package model;

public class Coffee extends MenuItem {
    private boolean isHot;

    public Coffee(String name, double price, boolean isHot) {
        super(name, price);
        this.isHot = isHot;
    }

    public boolean isHot() { return isHot; }

    @Override
    public String toString() {
        return super.toString() + ", Hot: " + (isHot ? "Yes" : "No");
    }
}
