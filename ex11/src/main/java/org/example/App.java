package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 hudson millar
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "How many euros?" );
        int euro = scan.nextInt();

        System.out.println( "What's the exchange rate?" );
        float rate = scan.nextFloat();

        double ans = euro*rate;
        System.out.println( euro + " is " +String.format("%.2f", ans)+ " dollars");

    }
}
