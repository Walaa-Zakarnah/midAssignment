/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

/**
 *
 * Abstract Subject
 */
public abstract class Subject {
  
	public abstract void addObserver(Observer o);
	public abstract void removeObserver(Observer o);
	public abstract void notifyObservers(String size);

}
