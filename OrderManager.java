/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * @author Zein
 */
import java.util.*;

public class OrderManager {

    private static OrderManager instance;
    private Map<Customer, TShirt> activeOrders;
    private Inventory inventory;

    private OrderManager() {
        activeOrders = new HashMap<>();
        inventory = new Inventory(); // Connect OrderManager to Inventory
    }

    public static synchronized OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public void placeOrder(Customer customer, TShirt tShirt) {
        if (activeOrders.containsKey(customer)) {
            System.out.println("Customer already has an active order.");
        } else if (inventory.isAvailable(tShirt)) {
            activeOrders.put(customer, tShirt);
            inventory.sellTShirt(tShirt.getSize());
            System.out.println("Order placed for " + customer.getName() + ": " + tShirt.getDescription());
        } else {
            System.out.println("T-shirt not in stock.");
        }
    }

    public void completeOrder(Customer customer) {
        if (activeOrders.containsKey(customer)) {
            TShirt completedOrder = activeOrders.remove(customer);
            System.out.println("Order completed: " + completedOrder.getDescription());
        } else {
            System.out.println("No active order for customer.");
        }
    }

    public Inventory getInventory() {
        return inventory;
    }
}
