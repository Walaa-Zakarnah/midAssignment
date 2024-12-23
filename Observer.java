/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * Role: Observer Interface in Observer Pattern
 * Responsibilities: 
 * Defines the contract (notify(String message)) for observers to implement and receive
 * updates from the Inventory.
 */
interface Observer {

    void notify(String message);
}
