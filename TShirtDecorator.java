/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * Abstract decorator.
 */
public abstract class TShirtDecorator extends TShirt { // to inherit type 
    //not applying this constructor causes an error to appear.
    public TShirtDecorator(String name, String description, String size) {
        super(name, description, size); // Pass the size to the parent class
    }

    // abstract function in TShirt Class needs to be implemented
    @Override
    public void formSize() {
        System.out.println("");
    }

    @Override
    public abstract String getDescription(); // To force concrete decorators apply this function.
}
