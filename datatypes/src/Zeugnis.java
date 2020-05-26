import AlgoTools.IO;

import java.util.ArrayList;
import java.util.List;


public class Zeugnis {


    //generische Klasse ArrayList; in spitzen Klammern: welhe Objeke sind in Liste erlaubt
    static List<FachNote> zensuren = new ArrayList<>(); //Kostruktoraufruf

    public static void main(String[] arg) {
        int i, n;
        String f;
        FachNote fn;
        boolean close = false;

        //Menue
        System.out.println("===========MEN\u00dc===========");
        System.out.println("n:     n\u00e4chste Zensur erfassen");
        System.out.println("d:     Ausgabe aller erfassten Zensuren");
        System.out.println("b:     Durchschnittsnote berechnen");
        System.out.println("x:     Beendet das Programm");

        while (!close) {
            char input = IO.readChar("Deine Wahl:");
            switch (input) {
                case 'n':
                    f = IO.readString("Fach: ");
                    n = IO.readInt("Note: ");
                    fn = new FachNote(f, n);
                    zensuren.add(fn);
                    break;
                case 'd':
                    for (i = 0; i <= zensuren.size() - 1; i++) {
                        zensuren.get(i).drucke(); //Fehlt
                    }
                    break;
                case 'b':
                    int g = 0;
                    for (i = 0; i <= zensuren.size() - 1; i++) {
                        g += zensuren.get(i).getNote();
                    }
                    g = g / zensuren.size();
                    System.out.println("Die Durchschnittsnote lautet " + g);//
                    break;
                case 'x':
                    close = true;
                    break;
                default:
                    System.out.println("Eingabe nicht gültig!");
                    break;
            }

        }
    }


    // ab hier m�ssen Sie den Code ersetzen (Aufgabe 20.5.20)
    //for (i=0; i<5;i++){
    //f = IO.readString("Fach?");
    //n = IO.readInt("Note?");
    //fn = new FachNote(f,n);
    //zensuren.add(fn);
    //}

    //System.out.println(zensuren.size());
    //System.out.println(zensuren.get(4));  //liefert nur interne Objektnummer
    //zensuren.get(4).drucke();             //nutzt eigene Ausgabefunktion der Klasse FachNote

    //zensuren.remove(2);
    //System.out.println(zensuren.size());

    //fn = new FachNote("Sport",12);
    //zensuren.add(0,fn);
    //System.out.println(zensuren.get(4));


}