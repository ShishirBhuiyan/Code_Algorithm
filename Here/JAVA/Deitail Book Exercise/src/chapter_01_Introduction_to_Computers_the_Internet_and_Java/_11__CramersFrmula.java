package chapter_01_Introduction_to_Computers_the_Internet_and_Java;

/**
 *      (Algebra: solve 2 * 2 linear equations)
 *      You can use Cramer’s rule to solve the following 2 * 2 system of linear equation.
 *      Write a program that solves the following equation and displays the value for x and y:
 *
 *          3.4x + 50.2y = 44.5
 *          2.1x + .55y = 5.9
 *
 * @author Md Shishir Bhuiyan
 */
public class _11__CramersFrmula {
    public static void main(String[] args) {
        // Variables for Cramer's formula
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        
        // Cramers's Formula
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        System.out.println("x = " + x + " y = " + y);
    }
}
