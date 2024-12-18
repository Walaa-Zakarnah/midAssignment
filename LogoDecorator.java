/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * @author Zein
 */
public class LogoDecorator extends TShirtDecorator {

    private TShirt tshirt;

    public LogoDecorator(TShirt tshirt) {
        super(tshirt.getDescription(), "with logo");
        this.tshirt = tshirt;
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription() + ", with bird logo";
    }
}

