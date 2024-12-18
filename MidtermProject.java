/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.midtermproject;

/**
 *
 * @author Zein
 */
public class MidtermProject {

    public static void main(String[] args) {
        // Create region factories
        RegionFactory chinaFactory = new ChinaFactory();
        RegionFactory middleEastFactory = new MiddleEastFactory();

        // Order 1: Customer from China
        TShirt chinaMediumTShirt = chinaFactory.createMediumTShirt();
        chinaMediumTShirt = new LogoDecorator(chinaMediumTShirt); // Add bird logo
        chinaMediumTShirt = new ColorDecorator(chinaMediumTShirt, "Blue"); // Add blue color
        System.out.println("Order 1: " + chinaMediumTShirt.getDescription());

        // Order 2: Customer from Middle East
        TShirt middleEastLargeTShirt = middleEastFactory.createLargeTShirt();
        middleEastLargeTShirt = new TextDecorator(middleEastLargeTShirt); // Add text
        middleEastLargeTShirt = new ColorDecorator(middleEastLargeTShirt, "Red"); // Add red color
        System.out.println("Order 2: " + middleEastLargeTShirt.getDescription());
        // Create inventory instance
        Inventory inventory = new Inventory();

        // Add observers for tracking
        InventoryObserver shopOwnerObserver = new InventoryObserver("Shop Owner");
        inventory.addObserver(shopOwnerObserver);

        // Simulate sales
        inventory.sellTShirt("Small");
        inventory.sellTShirt("Medium");
        inventory.sellTShirt("Large");
        inventory.sellTShirt("Small");

        // Display updated inventory
        System.out.println("Final stock after sales:");
        inventory.displayStock();
    }
     
     
}
