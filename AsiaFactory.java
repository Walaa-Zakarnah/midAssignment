/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * Concrete Factory (creator) extending the abstract factory.
 */
public class AsiaFactory extends RegionFactory{
    @Override
    public SmallTShirt createSmallTShirt() {
        return new SmallTShirt("Asia Small", "Small size for Asia");
    }

    @Override
    public MediumTShirt createMediumTShirt() {
        return new MediumTShirt("Asia  Medium", "Medium size for Asia");
    }

    @Override
    public LargeTShirt createLargeTShirt() {
        return new LargeTShirt("Asia Large", "Large size for Asia");
    }
}
