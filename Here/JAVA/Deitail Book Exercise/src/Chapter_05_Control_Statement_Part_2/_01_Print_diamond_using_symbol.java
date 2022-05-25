/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
         *
        ***
       ***** 
      ******* 
     ********* 
      ******* 
       ***** 
        *** 
         *


*/

package Chapter_05_Control_Statement_Part_2;

import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _01_Print_diamond_using_symbol {
    public static void main(String[] args) {
         processDiamond application = new processDiamond(); 
         application.diamond();
    }
}



class processDiamond{ 
    public void diamond(){
        
        Scanner input = new Scanner(System.in);
        System.out.print("How many line of star you want to make ? :");
        int howMuch = input.nextInt();
        int row,spaces,stars;
        
        for ( row = 0; row < howMuch; row++) {
            
             for ( spaces = howMuch; spaces > row; spaces-- ){
                System.out.print( " " );
             }
             
             for ( stars = 1; stars <= ( 2 * row ) - 1; stars++ ) {
                System.out.print( "*" );
             }
             
             
             System.out.println();
        }// end top half
        
        
        
        for ( row = howMuch - 1; row >= 1; row-- ) {
            for ( spaces = howMuch; spaces > row; spaces-- ) System.out.print( " " );
            for ( stars = 1; stars <= ( 2 * row ) - 1; stars++ ) System.out.print( "*" );
            
            System.out.println(); 
        } // end bottom half
    }
}




/*
    *
   ***
  ***** 
 ******* 
********* 
 ******* 
  ***** 
   *** 
    *


*/
