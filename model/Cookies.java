package model;

public class Cookies extends MenuItem {
    private double qtty;
    private boolean isCustom;

    public Cookies(String name, double price, double qtty, boolean isCustom) {
        super(name, price);
        this.qtty = qtty;
        this.isCustom = isCustom;
    }

    public boolean isCustom() { return isCustom; }
    public double getQtty() { return qtty; }

    @Override
    public String toString() {
        return super.toString() + ", Custom Made: " + (isCustom ? "Yes" : "No");
    }
    
}
