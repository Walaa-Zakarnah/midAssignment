/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * Abstract factory: Concrete products
 *  * Decorator Pattern: Concrete components.
 */
public class MediumTShirt extends TShirt {

    public MediumTShirt(String name, String description) {
        super(name, description, "Medium");
    }

    @Override
    public void formSize() {
        System.out.println("this is Medium size.");
    }

}
