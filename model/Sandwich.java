package model;

public class Sandwich extends MenuItem {
    private boolean hasSauce;

    public Sandwich(String name, double price, boolean hasSauce) {
        super(name, price);
        this.hasSauce = hasSauce;
    }

    public boolean hasSauce() { return hasSauce;}

    @Override
    public String toString() {
        return super.toString() + ", Does it have sauce? " + (hasSauce ? "Yes" : "No");
    }
}
