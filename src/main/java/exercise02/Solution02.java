/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Marc Palacio
 */

/*
 *    - Write an application
 *      that asks the user for a string
 *      calculates how many characters are in inputted string
 *      prints the number of characters in string
 */

package exercise02;
import java.util.*;

public class Solution02 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("What is the input string? ");
        String inString = input.nextLine();
        System.out.println(inString + " has " + inString.length() + " characters.");
    }
}
