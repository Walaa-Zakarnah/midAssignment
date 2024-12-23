/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 *
 * The RegionFactory is an abstract factory 
 * responsible for creating TShirt
 * objects of different types (e.g., SmallTShirt, MediumTShirt, LargeTShirt)
 * Responsibilities:
 * 1- Creates T-shirts specific to a region
 * 2- Provides a way to encapsulate regional-specific creation logic for T-shirts.
 */
public abstract class RegionFactory {

    public abstract SmallTShirt createSmallTShirt();

    public abstract MediumTShirt createMediumTShirt();

    public abstract LargeTShirt createLargeTShirt();
}
