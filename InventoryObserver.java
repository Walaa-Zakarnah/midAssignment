/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * Role: Concrete Observer in Observer Pattern 
 * Responsibilities: 
 * 1- Implements the Observer interface
 * 2- Represents entities ( Shop owner) interested in receiving inventory updates
 * 3- Displays notifications when inventory changes.
 */
public class InventoryObserver implements Observer {

    private String name;

    public InventoryObserver(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println(name + " received update: " + message);
    }
}
