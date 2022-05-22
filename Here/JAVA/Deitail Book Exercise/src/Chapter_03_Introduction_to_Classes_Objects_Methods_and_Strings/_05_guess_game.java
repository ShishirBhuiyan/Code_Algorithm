/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_03_Introduction_to_Classes_Objects_Methods_and_Strings;

import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _05_guess_game {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 0 for heads or 1 for tails: ");
        int userGuess = input.nextInt();

        System.out.println("Flipping coin...");
        int coinSide = (int) (Math.random() * 20.0);
        System.out.println(coinSide);

        if (userGuess == coinSide) {
            System.out.println("Good job! You guess is correct.");
        } else if (coinSide == 0) {
            System.out.println("Sorry, it is a head");
        } else {
            System.out.println("Sorry, it is a tail");
        }
    }
}
