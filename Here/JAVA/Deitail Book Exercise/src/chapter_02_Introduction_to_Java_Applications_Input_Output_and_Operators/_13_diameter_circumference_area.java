/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_02_Introduction_to_Java_Applications_Input_Output_and_Operators;

import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _13_diameter_circumference_area {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in ); 
        int radius; // radius of circle
        System.out.print( "Enter radius: " ); // prompt for input 
        radius = input.nextInt(); // read number
        
        
        System.out.printf( "Diameter is %d\n", ( 2 * radius ) );
        System.out.printf( "Area is %f\n", ( Math.PI * radius * radius ) ); System.out.printf( "Circumference is %f\n", ( 2 * Math.PI * radius ) );

    
    }
}
