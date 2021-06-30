import java.util.Scanner;

public class BinSearch {

    public static void main(String[] args) {


        //Input
        Scanner input = new Scanner(System.in);

        //Array
        int[] feld = new int[10];

        //Array Input
        System.out.println("Geben Sie die Listenelemente Sortiert ein!");
        System.out.println("Eingabe: ");
        for (int i = 0; i < feld.length; i++) {
            feld[i] = input.nextInt();
        }

        //Input Search
        System.out.println("Geben Sie nun die gesuchte Zahl an.");
        System.out.println("Eingabe: ");
        int x = input.nextInt();

        //Declaration
        int m = -1;
        int links;
        int rechts;

        links = 0;
        rechts = feld.length - 1;

        boolean s = false;

        while (links <= rechts) {
            m = links + rechts / 2;
            if (feld[m] == x) {
                System.out.println(m);
                s = true;
                break;
            }
            if (x < feld[m]) {
                rechts = m - 1;
            }
            if (x > feld[m]) {
                links = m + 1;
            }
        }
        if (s = false) {
            System.out.println(-1);
        }
    }
}
