/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testquestion2;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class TestQuestion2 {

    public static void main(String[] args) {
        String ConsoleType;
        String Store;
        int TotalSales;
        
        Scanner input= new Scanner(System.in);
        
System.out.println("Enter the console Type: ");
        ConsoleType=input.nextLine();
        System.out.println("Enter the store name: ");
        Store=input.nextLine();
        System.out.println("Enter the total: " + ConsoleType+"Accidents" + Store );
        TotalSales=Integer.parseInt(input.nextLine());
    }
}
