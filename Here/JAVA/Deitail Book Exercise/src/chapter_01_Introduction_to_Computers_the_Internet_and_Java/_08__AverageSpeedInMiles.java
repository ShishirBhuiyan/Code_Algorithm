package chapter_01_Introduction_to_Computers_the_Internet_and_Java;
/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _08__AverageSpeedInMiles {
    public static void main(String[] args) {

        double kilometers = 14.0;
        double miles = kilometers / 1.6;

        double speedRate = (45.5 * 60.0 + 30.0) / (60.0 * 60.0);
        double milesPerHour = miles / speedRate;

        System.out.println(milesPerHour);
    }
}
