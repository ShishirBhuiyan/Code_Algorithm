/**
    (Convert pounds into kilograms) Write a program that converts pounds into kilo- grams.
    The program prompts the user to enter a number in pounds, converts it to kilograms,
    and displays the result. One pound is 0.454 kilograms.
 *
 * @author Md Shishir Bhuiyan
 */
package chapter_02_Introduction_to_Java_Applications_Input_Output_and_Operators;


import java.util.Scanner;

public class _05_Convert_pounds_into_kilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");

        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");

        input.close();
    }
}
