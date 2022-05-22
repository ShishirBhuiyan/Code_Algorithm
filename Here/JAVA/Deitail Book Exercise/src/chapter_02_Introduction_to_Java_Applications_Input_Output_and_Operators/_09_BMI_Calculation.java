package chapter_02_Introduction_to_Java_Applications_Input_Output_and_Operators;
import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _09_BMI_Calculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1 Pound = 0.45359237 Kilogram
        System.out.print("Enter weight in Kg : ");
        double weight = input.nextDouble();

        // 1 Foot = 12 Inch
        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();

        // 1 in = 0.0254 m
        double bmi = weight / (inches * 0.0254 * inches * 0.0254);
        System.out.print("BMI is " + bmi);

        input.close();
    }
}
