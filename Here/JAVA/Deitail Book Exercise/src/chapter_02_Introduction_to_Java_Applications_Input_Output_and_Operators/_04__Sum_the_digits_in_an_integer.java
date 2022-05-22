/*
    (Sum the digits in an integer) Write a program that reads an integer
    between 0 and 1000 and adds all the digits in the integer.
    For example, if an integer is 932, the sum of all its digits is 14.
 *
 * @author Md Shishir Bhuiyan
 */
package chapter_02_Introduction_to_Java_Applications_Input_Output_and_Operators;

import java.util.Scanner;

public class _04__Sum_the_digits_in_an_integer {
    public static void main(String[] args) {
        
        int getDigit,total=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        String numberString = input.nextLine();
        

        // Convert String to int
        int number =Integer.parseInt(numberString);

        for (int i = 0; i < numberString.length(); i++) {
            getDigit = number % 10;
            number = number / 10;
            total += getDigit;
        }


        System.out.println("The sum of all digits in " + numberString + " is " + total);

        input.close();
    }
}
