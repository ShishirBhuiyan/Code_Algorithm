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
 * Chapter 7 Exercise 9:
 *
 *      (Find the smallest element)
 *      Write a method that finds the smallest element in an array
 *      of double values using the following header:
 *
 *          - public static double min(double[] array)
 *
 *      Write a test program that prompts the user to enter ten
 *      numbers, invokes this method to return the minimum value,
 *      and displays the minimum value.
 *
 */
public class _03_Find_the_smallest_element {
    
    static final int SIZE = 10;

    public static void main(String[] args) {

        double[] n = new double[SIZE];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter " + SIZE + " numbers: ");
        for (int i = 0; i < n.length; i++) n[i] = input.nextDouble();

        System.out.println("The minimum number is: " + min(n));
    }

    public static double min(double[] array) {

        double min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (min > array[i]) min = array[i];
        }

        return min;
    }
}
