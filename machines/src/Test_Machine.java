import java.util.Scanner;

public class Test_Machine {

    public static void main(String[] args) {
        String s;
        Machine a;

        Scanner input = new Scanner(System.in);
        a = new Machine();
        System.out.println("Gebe dein Wort ein: ");
        s = input.nextLine();

        if(a.wortPruefen(s))
            System.out.println("akzeptiert");
        else
            System.out.println("Nicht akzeptiert");
    }

}