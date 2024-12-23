/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * concrete decorator
 * Responsibilities: 
 * 1- Dynamically add additional features
 * (e.g., logos, colors, text) to TShirt instances
 * 2- Enhance flexibility in modifying T-shirt designs.
 *
 */
public class TextDecorator extends TShirtDecorator {

    private TShirt tshirt;// composition

    public TextDecorator(TShirt tshirt) {
        super(tshirt.getDescription(), "with text", tshirt.getSize());
        this.tshirt = tshirt;
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription() + ", Nice day!";// gets the object its wrapping, and wraps it with a text.
    }
}
