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
public class _01_vowel_consonent {
    
       public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = input.next().charAt(0);
        
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else if (isConsonant(ch)) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Input error.");
        }
    }

    // checks to see if char is a vowel a e i o u
    public static boolean isVowel(char ch){
        ch = Character.toUpperCase(ch);
        return !(ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' &&ch != 'U');
    }

    public static boolean isConsonant(char ch) {
        ch = Character.toUpperCase(ch);
        return !isVowel(ch) && (ch >= 'A' && ch <= 'Z');
    } 
}
