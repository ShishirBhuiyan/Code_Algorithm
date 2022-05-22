package chapter_02_Introduction_to_Java_Applications_Input_Output_and_Operators;

import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class Exersice_08 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();

        // Obtain the total milliseconds since the midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since the midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = ((totalHours + timeZoneChange) % 24);

        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
