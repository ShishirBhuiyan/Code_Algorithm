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
public class _05_distance_between_two_points {
    public static void main(String[] args) {
        distance application = new distance(); 
        application.calculateDistance();
    }
}




class distance{
    public void calculateDistance(){
        Scanner input = new Scanner( System.in );
        System.out.printf( "%s\n %s\n %s\n", "Type the end-of-file indicator to terminate",
            "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter", "On Windows type <ctrl> z then press Enter" ); 
        System.out.print( "Or Enter X1: " );

        while ( input.hasNext() ){
            double x1 = input.nextDouble(); 
            System.out.print( "Enter Y1: " ); 
            double y1 = input.nextDouble(); 
            System.out.print( "Enter X2: " ); 
            double x2 = input.nextDouble();
            System.out.print( "Enter Y2: " ); 
            double y2 = input.nextDouble();

            double distance = distance( x1, y1, x2, y2 ); 
            System.out.printf( "Distance is %f\n\n", distance );


           System.out.printf( "%s\n %s\n %s\n", "Type the end-of-file indicator to terminate",
               "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter", "On Windows type <ctrl> z then press Enter" ); 
           System.out.print( "Or Enter X1: " );
        }
    }
   
    // calculate distance between two points
    public double distance( double x1, double y1, double x2, double y2 ) {
         return Math.sqrt( Math.pow( ( x1 - x2 ), 2 ) + Math.pow( ( y1 - y2 ), 2 ) );
    } // end method distance
}
