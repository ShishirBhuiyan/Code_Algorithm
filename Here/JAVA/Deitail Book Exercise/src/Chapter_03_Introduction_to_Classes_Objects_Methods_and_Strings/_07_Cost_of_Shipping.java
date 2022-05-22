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
public class _07_Cost_of_Shipping {
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of weight: ");
        double weight = input.nextDouble();
        input.close();

        double cost = getCost(weight);
        System.out.printf("The cost is: $%.2f\n", cost);

    }

    private static double getCost(double weight) {

        if (weight > 50) {
            System.out.println("The package cannot be shipped.");
            System.exit(0);
        } else if (weight < 0) {
            System.out.println("Invalid weight...");
            System.exit(0);
        }

        double cost;

        if (weight <= 1) {
            cost = 3.5;
        } else if (weight <= 3) {
            cost = 5.5;
        } else if (weight <= 10) {
            cost = 8.5;
        } else {
            cost = 10.5;
        }

        return cost * weight;
    }
}
