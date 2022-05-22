package chapter_01_Introduction_to_Computers_the_Internet_and_Java;
/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _04__SquareFormulaTable {
    public static void main(String[] args) {
        System.out.printf("%s\t  %s\t  %s\n\n", "a", "a^2", "a^3");
        for (int i = 1; i <= 4; i++) {
            System.out.printf("%d\t  %d\t  %d\n\n", i, i * i, i * i * i);
        }
    }
}
