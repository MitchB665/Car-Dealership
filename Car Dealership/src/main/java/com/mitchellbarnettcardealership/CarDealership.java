package com.mitchellbarnettcardealership;

import java.util.Scanner;

public class CarDealership {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("---- Welcome to Mitchell's Car Dealership! ----");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("------- What are you in the market for? -------");
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("----------- Car --------------- SUV -----------");
        System.out.println("-----------------------------------------------");
        System.out.println("---------- Truck ------------ Minivan ---------");
        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.print(">>> ");
        String carSuvTruckMinivanChoice = userInput.nextLine();
        carSuvTruckMinivanChoice = carSuvTruckMinivanChoice.toLowerCase();



    }
}
