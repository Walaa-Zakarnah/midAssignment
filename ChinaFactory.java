/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * @author Zein
 */
public class ChinaFactory extends RegionFactory {

    @Override
    public SmallTShirt createSmallTShirt() {
        return new SmallTShirt("China Small", "Small size for China");
    }

    @Override
    public MediumTShirt createMediumTShirt() {
        return new MediumTShirt("China Medium", "Medium size for China");
    }

    @Override
    public LargeTShirt createLargeTShirt() {
        return new LargeTShirt("China Large", "Large size for China");
    }
}
