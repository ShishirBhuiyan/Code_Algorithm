package chapter_02_Introduction_to_Java_Applications_Input_Output_and_Operators;
import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _08_finding_runway_length {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = (speed * speed) / (2 * acceleration);
        System.out.print("The minimum runway length for this airplane is " + length);

        input.close();
    }
}
