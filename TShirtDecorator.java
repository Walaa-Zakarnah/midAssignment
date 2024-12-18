/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * @author Zein
 */
public abstract class TShirtDecorator extends TShirt {
    //not applying this constructor causes an error to appear.

    public TShirtDecorator(String name, String description) {
        super(name, description, "");
    }

    // abstract function in TShirt Class needs to be implemented
    @Override
    public void formSize() {
        System.out.println("");
    }

    @Override
    public abstract String getDescription();
}
