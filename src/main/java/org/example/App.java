package org.example;

import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *  *  Copyright 2021 ivan pavlov
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is the quote? " );

    Scanner scanner = new Scanner(System.in);
    String quote = scanner.nextLine();
    System.out.println( "Who said it? " );
    String author = scanner.nextLine();
    String f1 = author.concat(" says, \"");
    String f2 = f1.concat(quote);
    String f3 = f2.concat("\"");
    System.out.print( f3);}

}
