package com.mitchellbarnettcardealership.ui;

public class UserOutput {

    public static void displayTitleScreen() {
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("     Welcome to Mitchell's Car Dealership!     ");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("        What are you in the market for?        ");
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("          [ Car ]             [ SUV ]          ");
        System.out.println("-----------------------------------------------");
        System.out.println("         [ Truck ]          [ Minivan ]        ");
        System.out.println("-----------------------------------------------");
        // Move lines below to UserInput
        System.out.println();
        System.out.print(">>> ");
    }

    public static void displayMakeScreen() {
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("    Please enter the make of the vehicle you   ");
        System.out.println("              are interested in!               ");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println();
    }

    public static void displayModelScreen() {
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("   Please enter the model of the vehicle you   ");
        System.out.println("              are interested in!               ");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println();
    }
}
