/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testquestion2;

/**
 *
 * @author emeris
 */
public class ConsoleSales extends Consoles{

    public ConsoleSales(String ConsoleType, String Store, int TotalSales) {
        super(ConsoleType, Store, TotalSales);
    }
    
    public void printReport(){
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("****************************************************");
        System.out.println("CONSOLE TYPE:" + getConsoleType());
        System.out.println("STORE" + getStore());
        System.out.println("TOTAL SALES" +getTotalSales());

    }
    
}
