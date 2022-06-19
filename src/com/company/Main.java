package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.println("Enter The number of gallons of gas in the tank. " );
        float a = dd.nextFloat();
        System.out.println("Enter the fuel efficiency in miles per gallon. ");
        float b = dd.nextFloat();
        System.out.println("Enter The price of gas per gallon. ");
        float c = dd.nextFloat();

        System.out.println("With gass at $" + c + " per gallon, going 100 miles will cost you $" + (c * 100) );

        System.out.println("Since your car's efficiency is " + b + " mpg and given that you have " +  a + " gallons in the tank,  you can go " + (int)(b * a) + " miles before you run out of gas.");

    }
}
