/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * @author Zein
 */
public class MiddleEastFactory extends RegionFactory {

    @Override
    public SmallTShirt createSmallTShirt() {
        return new SmallTShirt("Middle East Small", "Small size for Middle East");
    }

    @Override
    public MediumTShirt createMediumTShirt() {
        return new MediumTShirt("Middle East Medium", "Medium size for Middle East");
    }

    @Override
    public LargeTShirt createLargeTShirt() {
        return new LargeTShirt("Middle East Large", "Large size for Middle East");
    }
}
