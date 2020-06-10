import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    //String
    private static String normal;

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //User Input
        System.out.println("Enter the Object that should be tested.");
        System.out.println("Here: ");
        normal = input.next();

        if (PalindromeTester(normal)) {
            System.out.println("Your Object is a Palindrome!");
        } else {
            System.out.println("Your Object is no Palindrome!");
        }
    }

    public static boolean PalindromeTester(String normal) {

        //Stack
        Stack<Character> rev = new Stack<Character>();

        for (int i = 0; i <= normal.length() - 1; i++) {
            rev.push(normal.charAt(i));
        }

        for (int i = 0; i <= normal.length() - 1; i++) {
            if (normal.charAt(i) == rev.pop()) {
            } else {
                return false;
            }
        }
        return true;
    }
}
