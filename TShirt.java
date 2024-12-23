/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * Abstract product for the factory pattern part,
 * Abstract Component for the
 * decorator pattern (core component)
 * --Responsibilities: 
 * 1- Represents a T-shirt with basic attributes (size, description, name).
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

    public abstract void formSize(); //  depends on each type; just add print statement indicating the type
}
