import AlgoTools.IO;

import java.util.LinkedList;


public class Zeugnis {

    static LinkedList<FachNote> zensuren = new LinkedList<>();

    public static void main(String[] arg) {
        int i, n;
        String f;
        FachNote fn;
        boolean close = false;
        boolean check = false;

        //Menue
        System.out.println("===========MEN\u00dc===========");
        System.out.println("n:     n\u00e4chste Zensur erfassen");
        System.out.println("d:     Ausgabe aller erfassten Zensuren");
        System.out.println("b:     Durchschnittsnote berechnen");
        System.out.println("a:     Eintrag \u00e4ndern");
        System.out.println("l:     Eintrag l\u00f6schen");
        System.out.println("m:     Erneutes Anziegen des Men\u00fcs");
        System.out.println("x:     Beendet das Programm");

        while (!close) {
            switch (IO.readChar("Deine Wahl:")) {
                case 'n':
                    f = IO.readString("Fach: ");
                    for (FachNote eing : zensuren) {
                        if (f.equalsIgnoreCase(eing.getFach())) {
                            check = true;
                            System.out.println("Dieses Fach wurde bereits eingetragen!");
                            System.out.println("Wenn du dies \u00e4ndern möchtest w\u00e4hle Option a!");
                        }
                    }
                    while (!check) {
                        n = IO.readInt("Note: ");
                        fn = new FachNote(f, n);
                        zensuren.add(fn);
                        check = true;
                    }
                    check = false;
                    break;
                case 'd':
                    for (i = 0; i <= zensuren.size() - 1; i++) {
                        zensuren.get(i).drucke();
                    }
                    break;
                case 'b':
                    int g = 0;
                    for (i = 0; i <= zensuren.size() - 1; i++) {
                        g += zensuren.get(i).getNote();
                    }
                    g = g / zensuren.size();
                    System.out.println("Die Durchschnittsnote lautet " + g);
                    break;
                case 'a':
                    f = IO.readString("Fach: ");
                    for (FachNote fn1 : zensuren) {
                        if (f.equalsIgnoreCase(fn1.getFach())) {
                            fn1.setFach(IO.readString("Neues Fach: "));
                            fn1.setNote(IO.readInt("Neue Note: "));
                            break;
                        }
                    }
                    break;
                case 'l':
                    f = IO.readString("Fach: ");
                    FachNote temp = null;
                    for (FachNote fn1 : zensuren) {
                        if (f.equalsIgnoreCase(fn1.getFach())) {
                            temp = fn1;
                            break;
                        }
                    }
                    zensuren.remove(temp);
                    break;
                case 'x':
                    close = true;
                    break;
                case 'm':
                    System.out.println("===========MEN\u00dc===========");
                    System.out.println("n:     n\u00e4chste Zensur erfassen");
                    System.out.println("d:     Ausgabe aller erfassten Zensuren");
                    System.out.println("b:     Durchschnittsnote berechnen");
                    System.out.println("a:     Eintrag \u00e4ndern");
                    System.out.println("l:     Eintrag l\u00f6schen");
                    System.out.println("m:     Erneutes Anzeigen des Men\u00fcs");
                    System.out.println("x:     Beendet das Programm");
                    break;
                default:
                    System.out.println("Eingabe nicht gültig!");
                    break;
            }
        }
    }
}

//School explanations for Add
//LinkedList Add (Element)
//  add:
//      lauf=kopf;
//      while(lauf.getNext()!=NULL){
//      lauf=lauf.getNext();
//  }
//      lauf.setNext(neu)

//LinkedList Add (Index,Element)
//  add(2,neu)
//      laufe mit lauf bis Element 1    (1. Schritt)
//      neu.setNext(lauf.getNext());    (2. Schritt)
//      lauf.setNext(neu);              (3. Schritt)
