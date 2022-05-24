/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_03_Introduction_to_Classes_Objects_Methods_and_Strings;

import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _09_monitors_account {
    public static void main(String[] args) {
        account application = new account(); 
        application.calculateBalance();
    }
}

class account{
    public void calculateBalance(){
       Scanner input = new Scanner( System.in );
        
       int account,oldBalance,charges,credits,creditLimit,newBalance;
       System.out.print( "Enter Account Number (or -1 to quit): " );
        
            account = input.nextInt(); // read in account number
            while ( account != -1 ){
                 System.out.print( "Enter Balance: " ); 
                 oldBalance = input.nextInt(); // read in original balance 
                 System.out.print( "Enter Charges: " ); 
                 charges = input.nextInt(); // read in charges 
                 System.out.print( "Enter Credits: " ); 
                 credits = input.nextInt(); // read in credits 
                 System.out.print( "Enter Credit Limit: " ); 
                 creditLimit = input.nextInt(); // read in credit limit 
                 // calculate and display new balance 
                 newBalance = oldBalance + charges - credits; 
                 System.out.printf( "New balance is %d\n", newBalance );
               // display a warning if the user has exceed the credit limit 
               if ( newBalance > creditLimit )
                System.out.println( "Credit limit exceeded" );


               System.out.print( "\nEnter Account Number (or -1 to quit): " ); 
               account = input.nextInt(); // read in next account number
         } // end while
    }
}
