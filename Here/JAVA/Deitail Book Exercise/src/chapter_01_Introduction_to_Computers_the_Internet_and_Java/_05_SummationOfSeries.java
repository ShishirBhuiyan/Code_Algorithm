package chapter_01_Introduction_to_Computers_the_Internet_and_Java;
/**
 *
 * @author Md Shishir Bhuiyan
 */
import java.util.Scanner;
import java.util.Arrays;

public class _05_SummationOfSeries {
    public static void main(String[] args) {
        
        // declear & intialize
        int range,total=0;

        // Ask 
        System.out.print("Enter Total Summation Number Range: ");
        // create Scanner class object
        Scanner input = new Scanner(System.in);

        // get a intiger value from user
        range = input.nextInt();
        // create int type array
        int[] series = new int[range];


        // operation
        for (int i = 0; i < series.length; i++) {
            series[i]=i+1;
            total = total + series[i];
        }

        // Show result
        System.out.printf("You Entered Nimber : %d\n ",range);
        System.out.println("The All Number List Which is created By loop : " + Arrays.toString(series));
        System.out.printf("Summation All Created Number : %d\n ",total);

        // Cloase input functionality
        input.close();
    }
}
