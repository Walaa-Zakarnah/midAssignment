/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * @author Zein
 */
public class TextDecorator extends TShirtDecorator {

    private TShirt tshirt;

    public TextDecorator(TShirt tshirt) {
        super(tshirt.getDescription(), "with text");
        this.tshirt = tshirt;
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription() + ", Nice day!";
    }
}