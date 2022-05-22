/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_04_Control_Statements;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _02_Random_character {
    public static void main(String[] args) {

        char ch = (char)(Math.random() * 26 + 'A');
        System.out.println(ch);
    }
}
