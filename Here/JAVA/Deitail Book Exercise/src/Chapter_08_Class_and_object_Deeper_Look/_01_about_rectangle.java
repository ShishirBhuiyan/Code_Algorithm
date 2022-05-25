/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_08_Class_and_object_Deeper_Look;

import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */

/**
 * 
 * (Rectangle Class) Create a class Rectangle. The class has attributes length and width, 
 * each of which defaults to 1. It has methods that calculate the perimeter and the area 
 * of the rectangle. It has set and get methods for both length and width. The set
 * methods should verify that length and width are each floating-point numbers 
 * larger than 0.0 and less than 20.0. Write a program to test class Rectangle.
 */
public class _01_about_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        Rectangle rectangle = new Rectangle();
        String choice = getMenuChoice();
        
        
        while ( "yes".matches(choice) ) {
                    System.out.print( "Enter length: " ); 
                    rectangle.setLength( input.nextDouble() );
                    System.out.print ( "Enter width: " ); 
                    rectangle.setWidth( input.nextDouble() );
            
            System.out.println ( rectangle.toString() ); 
            choice = getMenuChoice(); 
        } // end while
    } 
    
    
    // prints a menu and returns a value coressponding to the menu choice 
    private static String getMenuChoice() {
        Scanner input = new Scanner( System.in );
        System.out.println( "You want to continue ? yes or not" ); 
        System.out.print( "Write: " );
        return input.nextLine(); 
     } // end method getMenuChoice
}

class Rectangle{
   private double length; // the length of the rectangle 
   private double width; // the width of the rectangle
   
   // constructor without parameters 
   public Rectangle() {
    setLength( 1.0 ); 
    setWidth( 1.0 );
   } // end Rectangle no-argument constructor
   
   
   // constructor with length and width supplied
    public Rectangle( double theLength, double theWidth ) {
        setLength( theLength ); 
        setWidth( theWidth );
    } // end Rectangle two-argument constructor
    
    
    // validate and set length
    public void setLength( double theLength ) {
        length = ( theLength > 0.0 && theLength < 20.0 ? theLength : 1.0 ); 
    } // end method setLength
    
    // validate and set width
    public void setWidth( double theWidth ) {
        width = ( theWidth > 0 && theWidth < 20.0 ? theWidth : 1.0 ); 
    } // end method setWidth
    
    public double getLength() { return length; }
    public double getWidth() { return width; }
    public double area() { return length * width; }
    public double perimeter() { return 2 * length + 2 * width; }
    
    public String toString() {
       return String.format( "%s: %f\n%s: %f\n%s: %f\n%s: %f", "Length", length, "Width", width, "Perimeter", perimeter(), "Area", area() ); 
    }
    
    
}
