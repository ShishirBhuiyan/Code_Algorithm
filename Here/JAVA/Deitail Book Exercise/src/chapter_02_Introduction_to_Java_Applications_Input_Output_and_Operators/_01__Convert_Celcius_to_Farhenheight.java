
package chapter_02_Introduction_to_Java_Applications_Input_Output_and_Operators;
import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _01__Convert_Celcius_to_Farhenheight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");  

        input.close();
    }
}
