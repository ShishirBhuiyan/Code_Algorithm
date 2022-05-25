/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_07_Arrays_and_ArrayLists;

import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */

/**
 *      (Reverse the numbers entered)
 *      Write a program that reads ten integers and displays them
 *      in the reverse of the order in which they were read.
 *
 */
public class _02_reverse_the_numbers_entered {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        int[] n = new int[10];

        // passing input values to array
        for (int i = 0; i < 10; i++) 
            n[i] = input.nextInt();
        
        // displaying array in reverse order
        for (int i = n.length - 1; i >= 0; i--) 
            System.out.print(n[i] + " ");
    }
}
