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
public class _04_reverse_numver {
    public static void main(String[] args) {
        Reverse application = new Reverse(); 
        application.process();
    }
}


class Reverse{
   public void process(){
      Scanner input = new Scanner(System.in);
      System.out.print( "Enter an integer (-1 to exit): " );
      int number = input.nextInt();
      while ( number != -1 ) {
        System.out.printf( "%d reversed is %d\n", number, reverseDigits( number ) );
        System.out.print( "Enter an integer (-1 to exit): " ); 
        number = input.nextInt();
      }
   }
   
   public int reverseDigits( int number ) {
        int reverseNumber = 0; // the number in reverse order 
        int placeValue; // the value at the current place
        while ( number > 0 ) {
            placeValue = number % 10; 
            number = number / 10;
            reverseNumber = reverseNumber * 10 + placeValue; 
        }// end while loop 
       return reverseNumber; 
    } // end
}
