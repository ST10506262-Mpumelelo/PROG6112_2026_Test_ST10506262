/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testquestion2;

/**
 *
 * @author emeris
 */ 
public abstract class Consoles implements IConsoles {
    private String ConsoleType;
    private String Store;
    private int TotalSales;

    public Consoles() {
    }

    public Consoles(String ConsoleType, String Store, int TotalSales) {
        this.ConsoleType = ConsoleType;
        this.Store = Store;
        this.TotalSales = TotalSales;
    }
    
     @Override

    public String getConsoleType() {
        return ConsoleType;
    }

    public String getStore() {
        return Store;
    }

    public int getTotalSales() {
        return TotalSales;
    }
    
    public String show(){
        return ConsoleType +"" + Store+ ""+ TotalSales;
    }
}
