package controller;

import model.*;
import view.CafeView;

import javax.swing.*;
import java.util.List;

public class CafeController {
    private Menu menu;
    private CafeView view;

    public CafeController(Menu menu, CafeView view) {
        this.menu = menu;
        this.view = view;
        initController();
    }

    private void initController() {
        view.addDrinksButton.addActionListener(e -> addDrinks());
        view.addDessertsButton.addActionListener(e -> addDessert());
         view.addCakeButton.addActionListener(e -> addCake());
          view.addCookiesButton.addActionListener(e -> addCookies());
        view.addCoffeeButton.addActionListener(e -> addCoffee());
        view.addSandwichButton.addActionListener(e -> addSandwich());
        view.findItemButton.addActionListener(e -> findItem());
        view.displayAllButton.addActionListener(e -> displayAll());
    }

    private void addDrinks() {
        String name = JOptionPane.showInputDialog(view.frame, "Enter drink name:");
        if (name == null || name.isEmpty()) return;
        String priceInput = JOptionPane.showInputDialog(view.frame, "Enter drink price:");
        if (priceInput == null || priceInput.isEmpty()) return;
        double price = Double.parseDouble(priceInput);
        int isHotOption = JOptionPane.showConfirmDialog(view.frame, "Is the drink hot?", "Hot Beverage", JOptionPane.YES_NO_OPTION);
        boolean isHot = isHotOption == JOptionPane.YES_OPTION;

        menu.addItem(new Drinks(name, price, isHot));
        JOptionPane.showMessageDialog(view.frame, "Drink added successfully!");
    }
    private void addCoffee() {
        String name = JOptionPane.showInputDialog(view.frame, "Enter coffee type");
        if (name == null || name.isEmpty()) return;
        String priceInput = JOptionPane.showInputDialog(view.frame, "Enter coffee price:");
        if (priceInput == null || priceInput.isEmpty()) return;
        double price = Double.parseDouble(priceInput);
        int isHotOption = JOptionPane.showConfirmDialog(view.frame, "Is the coffee hot?", "Hot Coffee", JOptionPane.YES_NO_OPTION);
        boolean isHot = isHotOption == JOptionPane.YES_OPTION;

        menu.addItem(new Coffee(name, price, isHot));
        JOptionPane.showMessageDialog(view.frame, "Coffee added successfully!");
    }

    private void addDessert() {
        String name = JOptionPane.showInputDialog(view.frame, "Enter dessert name:");
        if (name == null || name.isEmpty()) return;
        String priceInput = JOptionPane.showInputDialog(view.frame, "Enter dessert price:");
        if (priceInput == null || priceInput.isEmpty()) return;
        double price = Double.parseDouble(priceInput);
        int isCustomOption = JOptionPane.showConfirmDialog(view.frame, "Is the dessert custom made?", "Custom Dessert", JOptionPane.YES_NO_OPTION);
        boolean isCustom = isCustomOption == JOptionPane.YES_OPTION;

        menu.addItem(new Desserts(name, price, isCustom));
        JOptionPane.showMessageDialog(view.frame, "Dessert added successfully!");
    }
     private void addCake() {
        String name = JOptionPane.showInputDialog(view.frame, "Enter cake flavor");
        if (name == null || name.isEmpty()) return;
        String priceInput = JOptionPane.showInputDialog(view.frame, "Enter cake price:");
        if (priceInput == null || priceInput.isEmpty()) return;
        double price = Double.parseDouble(priceInput);
        int isCustomOption = JOptionPane.showConfirmDialog(view.frame, "Is the cake custom made?", "Custom Dessert", JOptionPane.YES_NO_OPTION);
        boolean isCustom = isCustomOption == JOptionPane.YES_OPTION;

        menu.addItem(new Cake(name, price, isCustom));
        JOptionPane.showMessageDialog(view.frame, "Cake added successfully!");
    }

    private void addCookies() {
        String name = JOptionPane.showInputDialog(view.frame, "Enter cookies type");
        if (name == null || name.isEmpty()) return;
        String priceInput = JOptionPane.showInputDialog(view.frame, "Enter cookies price:");
        if (priceInput == null || priceInput.isEmpty()) return;
        double price = Double.parseDouble(priceInput);
        String qtyInput = JOptionPane.showInputDialog(view.frame, "Enter cookies quantity:");
        if (qtyInput == null || qtyInput.isEmpty()) return;
        double qtty = Double.parseDouble(qtyInput);
        int isCustomOption = JOptionPane.showConfirmDialog(view.frame, "Is the cookie custom made?", "Custom Cookie", JOptionPane.YES_NO_OPTION);
        boolean isCustom = isCustomOption == JOptionPane.YES_OPTION;

        menu.addItem(new Cookies(name, price, qtty, isCustom));
        JOptionPane.showMessageDialog(view.frame, "Cookie added successfully!");
    }

    private void addSandwich() {
        String name = JOptionPane.showInputDialog(view.frame, "Enter sandwich name:");
        if (name == null || name.isEmpty()) return;
        String priceInput = JOptionPane.showInputDialog(view.frame, "Enter sandwich price:");
        double price = Double.parseDouble(priceInput);
        int hasSauceOption = JOptionPane.showConfirmDialog(view.frame, "Does it have sauce", "Sauce", JOptionPane.YES_NO_OPTION);
        boolean hasSauce = hasSauceOption == JOptionPane.YES_OPTION;

        menu.addItem(new Desserts(name, price, hasSauce));
        JOptionPane.showMessageDialog(view.frame, "Sandwich added successfully!");
    }

    private void findItem() {
        String name = JOptionPane.showInputDialog(view.frame, "Enter the name of the item to find:");
        if (name == null || name.isEmpty()) return;
        MenuItem item = menu.findItemByName(name);
        if (item != null) {
            JOptionPane.showMessageDialog(view.frame, "Item found: " + item);
        } else {
            JOptionPane.showMessageDialog(view.frame, "Item not found.");
        }
    }

    private void displayAll() {
        List<MenuItem> items = menu.getAllItems();
        if (items.isEmpty()) {
            view.displayArea.setText("The menu is empty.");
        } else {
            StringBuilder sb = new StringBuilder("Menu Items:\n");
            for (MenuItem item : items) {
                sb.append(item).append("\n");
            }
            view.displayArea.setText(sb.toString());
        }
    }
}

