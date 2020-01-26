import java.io.StringReader;
import java.util.Scanner;

public class Test_Cellar_Machine {


    public static void main(String[] args) {
        String eingabe;
        Cellar_Machine k1;

        Scanner input = new Scanner(System.in);

        k1 = new Cellar_Machine();
        System.out.println("Gebe dein Wort ein: ");
        eingabe = input.nextLine();

        if(k1.wortPruefen(eingabe)) {
            System.out.println("Eingabe wird akzeptiert");
        }
        else
            System.out.println("Eingabe wird nicht akzeptiert");
    }

}