import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);
        String normal;

        //User Input
        System.out.println("Enter the Object that should be tested.");
        System.out.println("Here: ");
        normal = input.nextLine();

        normal = normal.toLowerCase();
        normal = normal.replaceAll("\\s+", "");
        System.out.println(normal);

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
