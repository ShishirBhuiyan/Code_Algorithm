/**
    (Find the number of years) Write a program that prompts the user to enter
    the minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
    For simplicity, assume a year has 365 days.
 *
 * @author Md Shishir Bhuiyan
 */

package chapter_02_Introduction_to_Java_Applications_Input_Output_and_Operators;


import java.util.Scanner;



public class _06_Find_the_number_of_years {
    public static void main(String[] args) {
        double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");

        double minutes = input.nextDouble();

        long years = (long) (minutes / minutesInYear);
        int days = (int) (minutes / 60 / 24) % 365;

        System.out.println((int) minutes + " minutes is approximately " + years + " years and " + days + " days");

        input.close();
    }
}
