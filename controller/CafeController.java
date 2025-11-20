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
        view.findItemButton.addActionListener(e -> findItem());
        view.displayAllButton.addActionListener(e -> displayAll());
    }

    private void addDrinks() {
        String name = JOptionPane.showInputDialog(view.frame, "Enter beverage name:");
        if (name == null || name.isEmpty()) return;
        String priceInput = JOptionPane.showInputDialog(view.frame, "Enter beverage price:");
        if (priceInput == null || priceInput.isEmpty()) return;
        double price = Double.parseDouble(priceInput);
        int isHotOption = JOptionPane.showConfirmDialog(view.frame, "Is the beverage hot?", "Hot Beverage", JOptionPane.YES_NO_OPTION);
        boolean isHot = isHotOption == JOptionPane.YES_OPTION;

        menu.addItem(new Drinks(name, price, isHot));
        JOptionPane.showMessageDialog(view.frame, "Beverage added successfully!");
    }

    private void addDessert() {
        String name = JOptionPane.showInputDialog(view.frame, "Enter food name:");
        if (name == null || name.isEmpty()) return;
        String priceInput = JOptionPane.showInputDialog(view.frame, "Enter food price:");
        if (priceInput == null || priceInput.isEmpty()) return;
        double price = Double.parseDouble(priceInput);
        int isVeganOption = JOptionPane.showConfirmDialog(view.frame, "Is the food vegan?", "Vegan Food", JOptionPane.YES_NO_OPTION);
        boolean isVegan = isVeganOption == JOptionPane.YES_OPTION;

        menu.addItem(new Desserts(name, price, isVegan));
        JOptionPane.showMessageDialog(view.frame, "Food added successfully!");
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

