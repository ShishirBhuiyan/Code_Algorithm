/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_06_Methods_Deeper_Look;

import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */


/**
 * 
 * Write a method multiple that determines, for a pair of integers, 
 * whether the second integer is a multiple of the first. The method should take 
 * two integer arguments and return true if the second is a multiple of the first and false otherwise. 
 * [Hint: Use the remainder operator.] Incorporate this method into an application
 * that inputs a series of pairs of integers (one pair at a time) 
 * and determines whether the second value in each pair is a multiple of the first.
 */
public class _01_multiple_that_determines {
    public static void main(String[] args) {
        multipple application = new multipple(); 
        application.checkMultipple();
    }
}

class multipple{ 
   public void checkMultipple(){
      Scanner input = new Scanner( System.in );
      int first; // the first number 
      int second; // the second number
      
      System.out.print( "Enter first number (0 to exit): " ); 
      first = input.nextInt();
      
      // use 0 as the sentinel value, since we cannot divide by zero
      while ( first != 0 ) {
        System.out.print( "Enter second number: " ); second = input.nextInt();
        if ( isItmultiple( first, second ) )
        System.out.printf( "%d is a multiple of %d\n", second, first );
        else
        System.out.printf( "%d is not a multiple of %d\n", second, first );
        System.out.print( "Enter first number (0 to exit): " ); first = input.nextInt();
    } // end while loop
   }
   
   
   // determine if first int is a multiple of the second 
   public boolean isItmultiple( int firstNumber, int secondNumber ) {
      return secondNumber % firstNumber == 0; 
   } // end method multiple
}
