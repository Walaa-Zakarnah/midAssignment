/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermproject;

import java.util.*;

/**
 *
 * @author Zein
 */
class Inventory {

    private Map<String, Integer> stock;
    private List<Observer> observers;

    public Inventory() {
        stock = new HashMap<>();
        stock.put("Small", 10);
        stock.put("Medium", 10);
        stock.put("Large", 10);
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public boolean isAvailable(TShirt tShirt) {
        return stock.getOrDefault(tShirt.getSize(), 0) > 0;
    }

    public void sellTShirt(String size) {
        stock.put(size, stock.get(size) - 1);
        notifyObservers(size);
    }

    private void notifyObservers(String size) {
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
