/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * concrete decorator.
 */
public class ColorDecorator extends TShirtDecorator {

    private TShirt tshirt;
    private String color;

    public ColorDecorator(TShirt tshirt, String color) {
        super(tshirt.getDescription(), "with color", tshirt.getSize());
        this.tshirt = tshirt;
        this.color = color;
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription() + ", in color: " + color;
    }
// can be applied like this too, yet the current design makes the need for less classes and complications.
//class BlueColorDecorator extends TShirtDecorator {
    // private TShirt tShirt;
//    public BlueColorDecorator(TShirt decoratedTShirt) {
//       this.tShirt = decoratedTShirt 
//       super(decoratedTShirt);
//    }
//
//    @Override
//    public String getDescription() {
//        return tShirt.getDescription() + " with Blue color";
//    }
//}
}
