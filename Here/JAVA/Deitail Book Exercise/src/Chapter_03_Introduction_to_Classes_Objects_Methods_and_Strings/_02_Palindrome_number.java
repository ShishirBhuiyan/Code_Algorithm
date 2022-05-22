
package Chapter_03_Introduction_to_Classes_Objects_Methods_and_Strings;
import java.util.Scanner;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _02_Palindrome_number {
    public static void main(String[] strings) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        String getInput = getInput();

//        do{
//            if (!isNumeric(getInput)) {
//                System.out.println("You inter wrong number");
//            }
//        }while (!isNumeric(getInput));

        
            if (!isNumeric(getInput)) {
                System.out.print("You inter wrong number! Please again ");
            }else{
              
            }



//        if(isPalindrome(getInput)){
//            System.out.println(getInput + " is a palindrome");
//            System.out.println("Lets another try : ");
////            getInput = getInput();
//        }else{
//            System.out.println(getInput() + " is not a palindrome");
//        }


    }

    
    
    public static String getInput(){
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();      
        return s1;  
    }
    
    
    
    
    // Check input is Numeric or not
    public static boolean isNumeric(String string) {
        
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) < '0' || string.charAt(i) > '9') {
                return false;
            }
        }

        return true;
    }


    // Check input is Palindrome or not
    public static boolean isPalindrome(String string) {
        // last index
        int high = string.length() - 1;
        
        for (int i = 0; i < string.length(); i++, high--){
            
            // string.charAt() meathod start index from 0
            if (string.charAt(i) != string.charAt(high)) {
                return false;
            }
        }

        return true;
    }
 
}
