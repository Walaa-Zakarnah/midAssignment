/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * @author Zein
 */
public class ColorDecorator extends TShirtDecorator {

    private TShirt tshirt;
    private String color;

    public ColorDecorator(TShirt tshirt, String color) {
        super(tshirt.getDescription(), "with color");
        this.tshirt = tshirt;
        this.color = color;
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription() + ", in color: " + color;
    }
}
