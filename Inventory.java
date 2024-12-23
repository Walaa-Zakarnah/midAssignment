/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

import java.util.*;

/**
 * Concrete Subject
 * Responsibilities:
 * 1- Maintains the stock of T-shirts
 * 2- Notifies attached observers when there are changes in inventory (e.g., T-shirt sold)
 * 3- Provides methods to sell T-shirts, check availability, and display stock.
 */
class Inventory extends Subject{

    private Map<String, Integer> stock;
    private List<Observer> observers;

    public Inventory() {
        stock = new HashMap<>();
        stock.put("Small", 10);
        stock.put("Medium", 10);
        stock.put("Large", 10);
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public boolean isAvailable(TShirt tShirt) {
        return stock.getOrDefault(tShirt.getSize(), 0) > 0;
    }

    public void sellTShirt(String size) { // to change the current stock.
        stock.put(size, stock.get(size) - 1);
        notifyObservers(size);
    }

    @Override
    public void notifyObservers(String size) {
        String message = "T-shirt size " + size + " sold. Remaining: " + stock.get(size);
        for (Observer observer : observers) {
            observer.notify(message);
        }
    }

    public void displayStock() {
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}
