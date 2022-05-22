package chapter_02_Introduction_to_Java_Applications_Input_Output_and_Operators;
import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _10_calculate_interest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble() / 100;

        double interest = balance * (annualInterestRate / 12);

        System.out.print("The interest is " + interest);
    }
}
