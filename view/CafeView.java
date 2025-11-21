package view;

import javax.swing.*;
//import javax.swing.border.Border;
import java.awt.*;

public class CafeView {
    public JFrame frame;
    public JButton addDrinksButton, addDessertsButton, addCakeButton, addCookiesButton, addSandwichButton, addCoffeeButton, findItemButton, displayAllButton;
    public JTextArea displayArea;

    public CafeView() {

        frame = new JFrame("Cafe Management System by Team 1!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLayout(new BorderLayout(10, 10));

       
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topPanel.setBackground(new Color(255, 240, 200));  

       
        JLabel titleLabel = new JLabel(" DANDANA Cafe Inventory ☕", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 32));
        titleLabel.setOpaque(true);
        titleLabel.setBackground(new Color(255, 230, 150));
        titleLabel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));

        
        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

        
        ImageIcon img = new ImageIcon("images.png");
        imageLabel.setIcon(img);

        topPanel.add(titleLabel, BorderLayout.NORTH);
        topPanel.add(imageLabel, BorderLayout.CENTER);

        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2, 15, 15));
        buttonPanel.setBorder(BorderFactory.createTitledBorder("Menu Options"));
        buttonPanel.setBackground(new Color(240, 250, 255));

        addDrinksButton = new JButton("Available Cold Drinks");
        addDessertsButton = new JButton("Available Desserts");
        addCakeButton = new JButton("Available Cakes");
        addCookiesButton = new JButton("Available Cookies");
        addCoffeeButton = new JButton("Available Coffee");
        addSandwichButton = new JButton("Available Sandwiches");
        findItemButton = new JButton("Find Item");
        displayAllButton = new JButton("Display Full Inventory");

        buttonPanel.add(addDrinksButton);
        buttonPanel.add(addDessertsButton);
        buttonPanel.add(addCakeButton);
        buttonPanel.add(addCookiesButton);
         buttonPanel.add(addCoffeeButton);
         buttonPanel.add(addSandwichButton);
        buttonPanel.add(findItemButton);
        buttonPanel.add(displayAllButton);

       
        displayArea = new JTextArea(8, 40);
        displayArea.setEditable(false);
        displayArea.setBorder(BorderFactory.createEtchedBorder());
        displayArea.setFont(new Font("Consolas", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("List Of Items"));

        
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(scrollPane, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
