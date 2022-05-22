package Chapter_03_Introduction_to_Classes_Objects_Methods_and_Strings;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _08_Compute_the_perimeter_of_a_triangle {
        public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 edge lengths of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        boolean isTriangle = ((side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side3 + side2 > side1));

        if(isTriangle){
            double perimeter = side1 + side2 + side3;
            System.out.println("You entered a real triangle with the perimeter of " + perimeter + ".");
        } else {
            System.out.println("Your input is not a valid triangle.");
        }
    }
}
