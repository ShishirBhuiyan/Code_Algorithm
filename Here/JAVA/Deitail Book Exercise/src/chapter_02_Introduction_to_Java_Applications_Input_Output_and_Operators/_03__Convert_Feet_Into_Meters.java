/*
    (Convert feet into meters) Write a program that reads a number in feet,
    converts it to meters, and displays the result. One foot is 0.305 meter.
 *
 * @author Md Shishir Bhuiyan
 */


package chapter_02_Introduction_to_Java_Applications_Input_Output_and_Operators;


import java.util.Scanner;

public class _03__Convert_Feet_Into_Meters {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters");

        input.close();
    }
}
