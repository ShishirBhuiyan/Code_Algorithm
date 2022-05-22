
/**
 *      (Compute the volume of a cylinder) Write a program that reads in the radius
 *      and length of a cylinder and computes the area and volume.
 *
 * @author Md Shishir Bhuiyan
 */

package chapter_02_Introduction_to_Java_Applications_Input_Output_and_Operators;

import java.util.Scanner;

public class _02__Volume_of_a_cylinder {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and the length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * 3.14159265359;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

        input.close();
    }
}
