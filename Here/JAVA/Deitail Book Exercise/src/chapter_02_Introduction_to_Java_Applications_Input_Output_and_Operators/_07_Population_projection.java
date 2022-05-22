package chapter_02_Introduction_to_Java_Applications_Input_Output_and_Operators;
import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _07_Population_projection {
    public static void main(String[] args) {
        double birthRateInSeconds = 7.0;
        double deathRateInSeconds = 13.0;
        double newImmigrantInSeconds = 45.0;
        double currentPopulation = 312032487.0;

        double secondsInYears = 60.0 * 60.0 * 24.0 * 365.0;

        // Calculation for Every year 
        double numBirths = secondsInYears / birthRateInSeconds;
        double numDeaths = secondsInYears / deathRateInSeconds;
        double numImmigrants = secondsInYears / newImmigrantInSeconds;

        // create scanner Class Object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        for (int i = 0; i < numberOfYears; i++) {
            currentPopulation += numBirths + numImmigrants - numDeaths;
        }

        System.out.println("The population in " + numberOfYears + " is " + (long) currentPopulation);

        input.close();
    }
}
