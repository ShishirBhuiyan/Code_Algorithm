
package chapter_02_Introduction_to_Java_Applications_Input_Output_and_Operators;
import java.util.Scanner;
/**
 *
 *      (Cost of driving)
 *      Write a program that prompts the user to enter the distance to drive,
 *      the fuel efficiency of the car in miles per gallon, and the price per gallon,
 *      and displays the cost of the trip.
 *
 * @author Md Shishir Bhuiyan
 */
public class _11_Cost_of_driving {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distance;
        double milesPerGallon;
        double pricePerGallon;

        // Getting input from user
        System.out.print("Enter the driving distance: ");
        distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        pricePerGallon = input.nextDouble();

        input.close(); // closing scanner

        double total = distance / milesPerGallon * pricePerGallon;
        // Displaying total cost
        System.out.printf("The cost of driving is $%.2f", total);
    }
}
