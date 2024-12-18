/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * @author Zein
 */
public abstract class TShirt {

    String description = "unknown shirt";
    String name;
    String size;

    public TShirt(String name, String description, String size) {
        this.name = name;
        this.description = description;
        this.size = size;

    }

    public String getDescription() {
        return name + " " + description;
    }

    public String getSize() {
        return size;
    }

    public abstract void formSize();

}
