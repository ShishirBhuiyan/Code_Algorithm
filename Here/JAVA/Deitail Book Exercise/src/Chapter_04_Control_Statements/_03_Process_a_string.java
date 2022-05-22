/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_04_Control_Statements;

import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _03_Process_a_string {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.next();
        input.close();

        System.out.println("String: " + s);
        System.out.println("Length = " + s.length());
        System.out.println("The first character is: " + s.charAt(0));

    }
}
