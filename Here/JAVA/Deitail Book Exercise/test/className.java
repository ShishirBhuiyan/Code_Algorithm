
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class className {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter String : ");
        String string = input.nextLine();
        char ch = '_';    
            
        //Replace space with specific character ch    
        string = string.replace(' ', ch);    
            
        System.out.println("New : _01_"+ string);   
    }    
}
