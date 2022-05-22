package chapter_01_Introduction_to_Computers_the_Internet_and_Java;
/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _06_CircleOperation {
    private static final double radius = 5.5;
    public static void main(String[] args) {

        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
        
    }
}
