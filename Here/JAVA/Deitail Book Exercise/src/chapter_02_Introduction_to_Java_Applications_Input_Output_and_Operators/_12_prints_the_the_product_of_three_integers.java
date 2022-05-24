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
public class _12_prints_the_the_product_of_three_integers {
    
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int x,y,z,result; 
        
        System.out.print( "Enter first integer: " ); // prompt for input
        x = input.nextInt(); // read first integer
        System.out.print( "Enter second integer: " ); // prompt for input 
        y = input.nextInt(); // read second integer
        System.out.print( "Enter third integer: " ); // prompt for input 
        z = input.nextInt(); // read third integer
        
        
        result = x * y * z; // calculate product of numbers System.out.printf( "Product is %d\n", result );

        System.out.printf( "Product is %d\n", result );
    }
    
    
  



}
