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
public class _04_Check_substring {
       public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s1 = input.nextLine();
        System.out.print("Enter String 2: ");
        String s2 = input.nextLine();
        input.close();

        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is NOT a substring of " + s1);
        }

    } 
}
