/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * Abstract factory: Concrete products
 * Decorator Pattern: Concrete component.
 *
 *
 */
public class SmallTShirt extends TShirt {

    public SmallTShirt(String name, String description) {
        super(name, description, "Small");
    }

    @Override
    public void formSize() {
        System.out.println("This is a small T-shirt.");
    }

}
