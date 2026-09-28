/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.question1;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class Question1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"}; // rows
        String[] consoles = {"PS5", "XBOX", "SWITCH"};//columns

        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
         String stars= "********************************************************";
         
        System.out.println("stars");
        System.out.println("Gaming Console Report");
        System.out.println("stars");
        
        int[][] accidents = new int[cities.length][consoles.length];
        
        for(int row = 0; row < cities.length ; row++){
         for(int col = 0; col < consoles.length; col++)
            System.out.println("Enter the console" + consoles[col] + "name of the city"+cities[row]);
         sales[row][col]=Integer.parseInt(input.nextLine());
        }

    }
}
