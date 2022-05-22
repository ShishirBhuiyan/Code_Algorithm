// Problem ace

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
public class _03_sort_three_numbers_without_sort_meathoad {
  public static void main(String[] strings) {

        int num1;
        int num2;
        int num3;

        // Grabbing input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three Integers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        input.close();
  
        // I'm using bitwise operators, so I don't have to create
        // a temp variable to swap the numbers
        if (num1 > num2) {
            num1 ^= num2;
            num2 ^= num1;
            num1 ^= num2;
        }

        if (num2 > num3) {
            num2 ^= num3;
            num3 ^= num2;
            num2 ^= num3;
        }

        if (num1 > num2) {
            num1 ^= num2;
            num2 ^= num1;
            num1 ^= num2;
        }
        System.out.println("Sorted Numbers: " + num1 + " " + num2 + " " + num3);
    }     
}
