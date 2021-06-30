import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);
        String normal;

        //User Input
        System.out.println("Gebe das Objekt ein was getestet werden soll.");
        System.out.print("Hier: ");
        normal = input.nextLine();

        //String Operations - Lowercase and No Spaces
        normal = normal.toLowerCase();
        normal = normal.replaceAll("\\s+", "");

        //Tester Results
        if (PalindromeTester(normal)) {
            System.out.println("Dein Objekt ist ein Palindrome!");
        } else {
            System.out.println("Dein Objekt ist kein Palindrome!");
        }
    }

    //Tester
    public static boolean PalindromeTester(String normal) {

        //Stack
        Stack<Character> rev = new Stack<>();

        //Stack push
        for (int i = 0; i < normal.length(); i++) {
            rev.push(normal.charAt(i));
        }

        //Tester - Stack pop
        for (int z = 0; z < normal.length(); z++) {
            if (normal.charAt(z) == rev.pop()) {
            } else {
                return false;
            }
        }
        return true;
    }
}
