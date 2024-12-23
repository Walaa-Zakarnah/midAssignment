/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.midtermproject;

/**
 *
 * Main Application Class/Coordinator Responsibilities: 1- Serves as the entry
 * point for the application 2- Demonstrates the use of all other classes and
 * patterns 3- Simulates the workflow of creating T-shirts, placing orders,
 * adding observers, and updating inventory.
 */
public class MidtermProject {

    public static void main(String[] args) {
        /*
        8. Test drive showing how customer can order the following
a. A person from china order blue medium T-shirt with bird logo
b. A person from middle east orders a red large T-shirt with Text
         */
        // Task 8: Test drive for customer orders
        OrderManager orderManager = OrderManager.getInstance();

        // a. A person from China orders a blue medium T-shirt with bird logo
        RegionFactory chinaFactory = new ChinaFactory();
        TShirt mediumBlueTShirtWithBirdLogo = new ColorDecorator(
                new LogoDecorator(chinaFactory.createMediumTShirt()), "Blue");
        
        Customer customerChina = new Customer("Chinese Customer");
        orderManager.placeOrder(customerChina, mediumBlueTShirtWithBirdLogo);

        // b. A person from the Middle East orders a red large T-shirt with text
        RegionFactory middleEastFactory = new MiddleEastFactory();
        TShirt largeRedTShirtWithText = new ColorDecorator(
                new TextDecorator(middleEastFactory.createLargeTShirt()), "Red");
        Customer customerMiddleEast = new Customer("Middle Eastern Customer");
        orderManager.placeOrder(customerMiddleEast, largeRedTShirtWithText);

        // Task 9: Shop owner tracking sold items
        System.out.println("\nInventory after sales:");
        Inventory inventory = orderManager.getInventory();
        inventory.displayStock();

        // Adding an observer to track inventory changes
        InventoryObserver shopOwner = new InventoryObserver("Shop Owner");
        inventory.addObserver(shopOwner);

        // Simulating additional sales for tracking
        System.out.println("\nSimulating additional sales:");
        inventory.sellTShirt("Medium");
        inventory.sellTShirt("Large");
 
    }

}
