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
 * Chapter 7 Exercise 8:
 *
 *      (Average an array)
 *      Write two overloaded methods that return the average of an array
 *      with the following headers:
 *
 *      - public static int average(int[] array)
 *      - public static double average(double[] array)
 *
 *      Write a test program that prompts the user to enter ten double values,
 *      invokes this method, and displays the average value.
 *
 * 
 **/
public class _01_Average_an_array {
   static final int SIZE = 10;

    public static void main(String[] args) {

        double[] numbers = new double[SIZE];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 double numbers: ");
        for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextDouble();

        System.out.println("The average value is: " + average(numbers));
        printArray(numbers,3);

    }

    public static double average(double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }

    public static void printArray(double[] array, int numberPerLine) {

        for (int i = 0; i < array.length; i++) {

            if(i>2 && i%2!=0) System.out.println("");
            System.out.print(array[i]+" ");
        }
    }     
}
