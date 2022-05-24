/*
    Using an approach similar to that for Exercise 4.21, find the two largest values 
    of the 10 values entered. [Note: You may input each number only once.]
 */
package Chapter_04_Control_Statements;

import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _05_find_two_largest_value {
    public static void main(String[] args) {
        TwoLargest application = new TwoLargest(); 
        application.determineTwoLargest();
    }
}



class TwoLargest{
    
    public void determineTwoLargest(){
        Scanner input = new Scanner( System.in ); 
        
        int largest; // largest number
        int nextLargest; // second largest number 
        int number; // user input
        int counter; // number of values entered
        
        // get first number and assign it to variable largest 
        System.out.print( "Enter number: " ); 
        largest = input.nextInt();
        
        // get second number and compare it with first number 
        System.out.print( "Enter number: " ); 
        number = input.nextInt();
        
        if ( number > largest ) {
           nextLargest = largest; 
           largest = number;
        }else{
          nextLargest = number;
        }
        
        counter = 2;
        
        while ( counter < 10 ) {
            System.out.print( "Enter number: " ); 
            number = input.nextInt();
            
            if ( number > largest ) { 
                nextLargest = largest; 
                largest = number;
            } // end if
            else if ( number > nextLargest ) 
                    nextLargest = number;
            counter++; 
            
        } // end while loop
        System.out.printf( "Largest is %d\nSecond largest is %d\n", largest, nextLargest );
        
    }
}
