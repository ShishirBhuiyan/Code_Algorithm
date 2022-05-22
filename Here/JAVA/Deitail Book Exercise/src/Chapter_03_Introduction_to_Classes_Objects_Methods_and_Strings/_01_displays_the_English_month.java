
package Chapter_03_Introduction_to_Classes_Objects_Methods_and_Strings;
/**
 *      (Random month) Write a program that randomly generates
 *      an integer between 1 and 12 and displays the English month
 *      name January, February, ..., December for the number 1, 2, ..., 12, accordingly.
 *
 * @author Md Shishir Bhuiyan
 */
public class _01_displays_the_English_month {
     public static void main(String[] strings) {
        int randomMonth = (int) (Math.random() * 12) + 1;
        System.out.println(getMonthName(randomMonth));
    }

    // Get the name for the month
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;

            default:
                monthName = "INVALID MONTH RANGE";
        }

        return monthName;
    }   
}
