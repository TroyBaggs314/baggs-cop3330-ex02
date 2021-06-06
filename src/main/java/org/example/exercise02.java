/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.util.Scanner;
public class exercise02
{
    public static void main (String[] args)
    {
        String name = input();
        System.out.println(name + " has " + name.length() + " characters.");

    }

    public static String input ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the input string?");
        return sc.nextLine();
    }
}
