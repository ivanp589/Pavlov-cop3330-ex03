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
    System.out.print( author+ " says, \""+quote+"\"");}

}
