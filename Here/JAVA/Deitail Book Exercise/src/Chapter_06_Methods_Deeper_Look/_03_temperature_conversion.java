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
public class _03_temperature_conversion {
    public static void main(String[] args) {
        Convert application = new Convert(); 
        application.convert();
    }
}

class Convert {
 
   public void convert(){ 
      Scanner input = new Scanner( System.in ); 
      int choice; // the user's choice in the menu
      
       do {
           System.out.println( "1. Fahrenheit to Celsius" ); 
           System.out.println( "2. Celsius to Fahrenheit" ); 
           System.out.println( "3. Exit" ); 
           System.out.print( "Choice: " ); 
           
           choice = input.nextInt();
           
           
            if ( choice != 3 ) {
                System.out.print( "Enter temperature: " ); 
                int oldTemperature = input.nextInt();
                // convert the temperature appropriately 
                switch ( choice ) {
                   case 1:
                   System.out.printf( "%d Fahrenheit is %d Celsius\n\n\n", oldTemperature, celsius( oldTemperature ) );
                   break; case 2:
                   System.out.printf( "%d Celsius is %d Fahrenheit\n\n\n", oldTemperature, fahrenheit( oldTemperature ) );
                   break; 
                } // end switch 
            } // end if
       } while (choice != 3 );
       
   }
   
   public int celsius( int fahrenheitTemperature ) {
      return ( (int) ( 5.0 / 9.0 * ( fahrenheitTemperature - 32 ) ) ); 
   } // end method celsius
   
   
   // return Fahrenheit equivalent of Celsius temperature 
   public int fahrenheit( int celsiusTemperature ) {
    return ( (int) ( 9.0 / 5.0 * celsiusTemperature + 32 ) ); 
   } // end method fahrenheit
}
