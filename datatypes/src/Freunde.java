import java.util.Scanner;

public class Freunde {


    public static void main(String[] args) {

        MeineVListe freunde = new MeineVListe();
        Person p, h;
        int eingabe;
        String m, n;

        boolean exit = false;

        Scanner input = new Scanner(System.in);

        while (exit != true) {
            System.out.println("--- Menu ---");
            System.out.println("1. - Freund hinzufügen");
            System.out.println("2. - Freund entfernen");
            System.out.println("3. - Daten ändern");
            System.out.println("4. - Daten eines Freundes ausgeben");
            System.out.println("5. - Alle Freunde ausgeben");
            System.out.println("6. - Programm beenden");

            System.out.println("Bitte wählen Sie: ");

            switch (input.nextByte()) {
                case 1:


                    //Eingabe Name
                    System.out.println("Geben Sie den Vornamen ein: ");
                    m = input.next();

                    System.out.println("Geben Sie den Nachnamen ein: ");
                    n = input.next();

                    //Initalizierung Person
                    p = new Person(m, n);

                    //Eingabe Hobbies
                    System.out.println("Wollen Sie Hobbies hinzufügen (true/false): ");
                    boolean hob = input.nextBoolean();
                    if (hob == true) {
                        System.out.println("Wie viele Hobbies wollen sie hinzufügen? (maximal 3)");
                        switch (input.nextByte()) {
                            case 1:
                                System.out.println("Bitte geben Sie das Hobbie ein: ");
                                p.addHobby(input.next());
                                break;
                            case 2:
                                System.out.println("Bitte geben Sie das erste Hobbie ein: ");
                                p.addHobby(input.next());
                                System.out.println("Bitte geben Sie das zweite Hobbie ein: ");
                                p.addHobby(input.next());
                                break;
                            case 3:
                                System.out.println("Bitte geben Sie das erste Hobbie ein: ");
                                p.addHobby(input.next());
                                System.out.println("Bitte geben Sie das zweite Hobbie ein: ");
                                p.addHobby(input.next());
                                System.out.println("Bitte geben Sie das dritte Hobbie ein: ");
                                p.addHobby(input.next());
                                break;
                            default:
                                System.out.println("Es können maximal 3 Hobbies angegeben werden!");
                                System.out.println("Geben Sie die Hobbies später ein.");
                        }
                    }
                    freunde.append(p);
                    break;
                case 2:
                    System.out.println("Bitte geben Sie die Position ein, welche gelöscht werden soll: ");
                    int d = input.nextInt() - 1;
                    System.out.println("Folgender Freund wird gelöscht:");
                    h = (Person) freunde.getItem(d);
                    h.drucke();

                    freunde.delete(d);
                    break;
                case 3:

                    boolean changestop = false;

                    System.out.println("Welchen Freund wollen sie verändern: ");
                    eingabe = input.nextByte() - 1;
                    h = (Person) freunde.getItem(eingabe);
                    System.out.println("Dies ist die Person, welche sie verändern.");
                    h.drucke();

                    while (changestop != true) {
                        System.out.println("Was möchten Sie verändern?");
                        System.out.println("1. Vorname");
                        System.out.println("2. Nachname");
                        System.out.println("3. Hobbies hinzufügen");
                        System.out.println("4. Abbruch");
                        System.out.print("Eingabe: ");

                        switch (input.nextByte()) {
                            case 1:
                                System.out.println("Bitte geben Sie den neuen Vornamen ein: ");
                                h.setVorname(input.next());
                                freunde.setItem(eingabe - 1, h);
                                break;
                            case 2:
                                System.out.println("Bitte geben Sie den neuen Nachnamen ein: ");
                                h.setNachname(input.next());
                                freunde.setItem(eingabe - 1, h);
                                break;
                            case 3:
                                System.out.println("Bitte geben Sie ein Hobbie ein: ");
                                h.addHobby(input.next());
                                freunde.setItem(eingabe - 1, h);
                                break;
                            case 4:
                                System.out.println("Abbruch");
                                changestop = true;
                                break;
                            default:
                                System.out.println("Dieser Menüpunkt existiert nicht.");
                        }
                        System.out.println("Freund erfolgreich geändert.");
                        h.drucke();
                    }
                    break;
                case 4:
                    System.out.println("Welchen Freund wollen sie ausgeben: ");
                    eingabe = input.nextByte() - 1;
                    h = (Person) freunde.getItem(eingabe);
                    System.out.println("Dies ist ihre gesuchte Person:");
                    h.drucke();
                    break;
                case 5:
                    if (freunde.isEmpty())
                        System.out.println("Liste ist leer");
                    else {
                        for (int i = 0; i < freunde.getLength(); i++) {
                            p = (Person) freunde.getItem(i);
                            p.drucke();
                        }
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Dieser Menüpunkt existiert nicht.");

            }
        }

    }
}
